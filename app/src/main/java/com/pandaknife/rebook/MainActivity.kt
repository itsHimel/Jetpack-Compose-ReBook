package com.pandaknife.rebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pandaknife.rebook.ui.scrrens.BottomNavItem
import com.pandaknife.rebook.ui.scrrens.BottomNavigationBar
import com.pandaknife.rebook.ui.scrrens.HomeScreen
import com.pandaknife.rebook.ui.theme.ReBookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReBookTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "ReBook",
                                    style = MaterialTheme.typography.h6,
                                    color = MaterialTheme.colors.onPrimary
                                )
                            }
                        )
                    },

                        bottomBar = {
                            BottomNavigationBar(
                                items = listOf(
                                    BottomNavItem(
                                        name = "Catalog",
                                        route = "catalog",
                                        icon = R.drawable.book_filed,
                                        selected = true
                                    ),
                                    BottomNavItem(
                                        name = "Library",
                                        route = "library",
                                        icon = R.drawable.open_book_filed,
                                        selected = false

                                    ),
                                    BottomNavItem(
                                        name = "Settings",
                                        route = "settings",
                                        icon = R.drawable.settings_filed,
                                        selected = false

                                    ),
                                )
                            )
                        }
                    ) {
                        HomeScreen()
                    }

                }
            }
        }
    }
}