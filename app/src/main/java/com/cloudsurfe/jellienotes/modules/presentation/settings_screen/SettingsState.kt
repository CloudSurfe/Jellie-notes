package com.cloudsurfe.jellienotes.modules.presentation.settings_screen

data class SettingsState(
    val firstLaunch : Boolean = true,
    val darkMode : Boolean? = null,
)