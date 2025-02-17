package com.theapache64.stackzy.ui.feature.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.arkivanov.decompose.ComponentContext
import com.theapache64.stackzy.di.AppComponent
import com.theapache64.stackzy.ui.navigation.Component
import javax.inject.Inject

/**
 * Splash Screen Component
 */
class SplashScreenComponent(
    appComponent: AppComponent,
    private val componentContext: ComponentContext,
    private val onSyncFinished: () -> Unit
) : Component, ComponentContext by componentContext {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    init {
        appComponent.inject(this)
    }

    @Composable
    override fun render() {

        splashViewModel.init(rememberCoroutineScope())
        splashViewModel.syncData()

        SplashScreen(
            splashViewModel = splashViewModel,
            onSyncFinished = onSyncFinished
        )
    }

}