package com.theapache64.stackzy.ui.feature.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.arkivanov.decompose.ComponentContext
import com.github.theapache64.gpa.model.Account
import com.theapache64.stackzy.di.AppComponent
import com.theapache64.stackzy.ui.navigation.Component
import javax.inject.Inject

class LogInScreenComponent(
    appComponent: AppComponent,
    private val componentContext: ComponentContext,
    private val onLoggedIn: (Account) -> Unit,
    private val onBackClicked: () -> Unit,
) : Component, ComponentContext by componentContext {

    @Inject
    lateinit var viewModel: LogInScreenViewModel

    init {
        appComponent.inject(this)
    }

    @Composable
    override fun render() {
        viewModel.init(rememberCoroutineScope())
        LogInScreen(
            viewModel = viewModel,
            onLoggedIn = onLoggedIn,
            onBackClicked = onBackClicked
        )
    }

}