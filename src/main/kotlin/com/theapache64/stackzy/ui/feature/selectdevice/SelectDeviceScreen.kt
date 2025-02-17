package com.theapache64.stackzy.ui.feature.selectdevice

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.theapache64.stackzy.data.local.AndroidDevice
import com.theapache64.stackzy.ui.common.CustomScaffold
import com.theapache64.stackzy.ui.common.FullScreenError
import com.theapache64.stackzy.ui.common.Selectable
import com.theapache64.stackzy.util.R
import com.toxicbakery.logging.Arbor

/**
 * To select a device from connected devices
 */
@Composable
fun SelectDeviceScreen(
    selectDeviceViewModel: SelectDeviceViewModel,
    onBackClicked: () -> Unit,
    onDeviceSelected: (AndroidDevice) -> Unit
) {
    val scope = rememberCoroutineScope()

    DisposableEffect(scope) {
        Arbor.d("Init scope")
        selectDeviceViewModel.init(scope)
        selectDeviceViewModel.watchConnectedDevices()
        onDispose {
            Arbor.d("Dispose scope")
            selectDeviceViewModel.stopWatchConnectedDevices()
        }
    }

    val devices by selectDeviceViewModel.connectedDevices.collectAsState()

    Content(
        devices = devices,
        onDeviceSelected = onDeviceSelected,
        onBackClicked = onBackClicked
    )
}

@Composable
fun Content(
    devices: List<AndroidDevice>?,
    onDeviceSelected: (AndroidDevice) -> Unit,
    onBackClicked: () -> Unit
) {
    if (devices == null) {
        // Just background
        Box(
            modifier = Modifier.fillMaxSize()
        )
        return
    }

    // Content
    CustomScaffold(
        title = R.string.device_select_the_device,
        onBackClicked = onBackClicked
    ) {

        if (devices.isEmpty()) {
            FullScreenError(
                title = R.string.device_no_device_title,
                message = R.string.device_no_device_message,
                image = imageResource("drawables/no_device.png")
            )
        } else {

            Spacer(
                modifier = Modifier.height(10.dp)
            )

            LazyColumn {
                items(devices) { device ->
                    Selectable(
                        data = device,
                        modifier = Modifier
                            .width(400.dp),
                        onSelected = onDeviceSelected
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )
                }
            }

        }

    }


}





