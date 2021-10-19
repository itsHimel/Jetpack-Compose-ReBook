package com.pandaknife.rebook.ui.CatalogScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pandaknife.rebook.R

@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    modifier: Modifier = Modifier,
) {
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 6.dp
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                selected = item.selected,
                onClick = { },
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = Color.Gray,
                icon = {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Image(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.name,
                            modifier = Modifier
                                .size(24.dp),
                            colorFilter = ColorFilter.tint(
                                color = if (item.selected) {
                                    MaterialTheme.colors.primary
                                } else {
                                    Color.Gray
                                }
                            )
                        )
                        Text(
                            text = item.name,
                            style = MaterialTheme.typography.caption,
                            color = if (item.selected) {
                                MaterialTheme.colors.primary
                            } else {
                                Color.Gray
                            }
                        )

                    }

                }
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
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