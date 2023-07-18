package com.alextos.contactsapp.core

import androidx.compose.ui.window.ComposeUIViewController
import com.alextos.contactsapp.App
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

fun MainViewController() = ComposeUIViewController {
    val isDarkMode = UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark
    App(
        darkTheme = isDarkMode,
        dynamicColor = false
    )
}