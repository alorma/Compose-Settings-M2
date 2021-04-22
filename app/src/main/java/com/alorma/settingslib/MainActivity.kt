package com.alorma.settingslib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Settings
import com.alorma.settings.SettingsList
import com.alorma.settings.composables.SettingsCheckbox
import com.alorma.settings.composables.SettingsGroup
import com.alorma.settings.composables.SettingsSwitch
import com.alorma.settingslib.ui.theme.SettingsLibTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingsLibTheme {
                SettingsList(title = { Text(text = "Demo settings") }) {
                    SettingsGroup {
                        SettingsSwitch(
                            key = "Demo1",
                            icon = {
                                Icon(imageVector = Icons.Default.MailOutline,
                                    contentDescription = "Wifi")
                            },
                            title = { Text(text = "Demo 1") },
                            checked = false
                        )
                        Divider()
                        SettingsCheckbox(
                            key = "Demo2",
                            icon = {
                                Icon(imageVector = Icons.Default.Settings,
                                    contentDescription = "User")
                            },
                            title = { Text(text = "Demo 2") },
                            subtitle = { Text(text = "This a subtitle") },
                            checked = true
                        )
                    }
                    SettingsGroup(
                        title = { Text(text = "Group 2") },
                    ) {
                        SettingsSwitch(
                            key = "Demo3",
                            icon = {
                                Icon(imageVector = Icons.Default.Info,
                                    contentDescription = "Wifi")
                            },
                            title = { Text(text = "Demo 3") },
                            checked = false
                        )
                        Divider()
                        SettingsCheckbox(
                            key = "Demo4",
                            icon = {
                                Icon(imageVector = Icons.Default.Call,
                                    contentDescription = "User")
                            },
                            title = { Text(text = "Demo 4") },
                            subtitle = { Text(text = "This a subtitle") },
                            checked = true
                        )
                    }
                }
            }
        }
    }
}