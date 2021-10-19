package com.pandaknife.rebook.ui.CatalogScreen


import com.pandaknife.rebook.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.pandaknife.rebook.repository.BookRepository
import com.pandaknife.rebook.ui.components.BookItem
import com.pandaknife.rebook.ui.components.ItemCard
import com.pandaknife.rebook.ui.components.SearchBar
import com.pandaknife.rebook.ui.theme.Arsenic

@Composable
fun HomeScreen() {

    val repository = BookRepository()
    val book = repository.getBooks()


    LazyColumn {

        item {
            Column(
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 14.dp)
            ) {

                SearchBar()
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Recomended for you",
                    style = MaterialTheme.typography.h6,
                    color = Arsenic
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Collected for you based on preference",
                    style = MaterialTheme.typography.body2,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(4.dp))


            }
        }
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                items(items = book) { item ->
                    BookItem(
                        book = item,
                        onItemClick = { }
                    )

                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                shape = MaterialTheme.shapes.medium,
                backgroundColor = MaterialTheme.colors.primary,
                modifier = Modifier
                    .padding(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth()
                            .weight(3f)
                    ) {
                        Text(
                            text = "The Almanack of Naval Ravikant: " +
                                    "A Guide To Wealth And Happiness",
                            style = MaterialTheme.typography.subtitle2,
                            maxLines = 2,
                            color = MaterialTheme.colors.onPrimary
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Eric Jorgenson",
                            style = MaterialTheme.typography.overline,
                            color = MaterialTheme.colors.onPrimary
                        )

                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Image(
                        painter = painterResource(id = R.drawable.play_field),
                        contentDescription = "Play Button",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.3f))
                            .padding(6.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .padding(11.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))

                }

            }
        }
        items(items = book) { item ->
            ItemCard(
                book = item,
            )

        }
    }
}
