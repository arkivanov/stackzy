package com.theapache64.stackzy.data.repo

import com.theapache64.expekt.should
import com.theapache64.stackzy.test.MyDaggerMockRule
import com.theapache64.stackzy.test.runBlockingUnitTest
import com.theapache64.stackzy.util.calladapter.flow.Resource
import com.toxicbakery.logging.Arbor
import it.cosenonjaviste.daggermock.InjectFromComponent
import kotlinx.coroutines.flow.collect
import org.junit.Rule
import org.junit.Test


class ConfigRepoTest {
    @get:Rule
    val daggerMockRule = MyDaggerMockRule()

    @InjectFromComponent
    private lateinit var configRepo: ConfigRepo

    @Test
    fun `Get from remote, store in local and get from local`() = runBlockingUnitTest {
        configRepo.getRemoteConfig().collect {
            when (it) {
                is Resource.Loading -> {
                    Arbor.d("Loading config")
                }
                is Resource.Success -> {
                    val remoteConfig = it.data
                    remoteConfig.should.not.`null`

                    // Got data, now store it in local
                    configRepo.saveConfigToLocal(remoteConfig)

                    // Now get from local
                    val localConfig = configRepo.getLocalConfig()

                    // Both should same
                    remoteConfig.should.equal(localConfig)
                }
                is Resource.Error -> {
                    assert(false) {
                        it.errorData
                    }
                }
            }
        }
    }

}
