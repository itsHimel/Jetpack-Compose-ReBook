package com.pandaknife.rebook.ui.components

import android.widget.RatingBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pandaknife.rebook.R
import com.pandaknife.rebook.data.Book

@Composable
fun ItemCard(
    book: Book
) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(vertical = 6.dp, horizontal = 12.dp)
            .height(105.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            Card(
                modifier = Modifier
                    .height(95.dp)
                    .width(65.dp)
                    .align(Alignment.CenterVertically)
//                    .weight(1f)
            ) {
                Image(
                    painter = painterResource(id = book.bookCover),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                )

            }
            Spacer(modifier = Modifier.width(12.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth()
                    .weight(3f)
            ) {
                Text(
                    text = book.authorName,
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.primary,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = book.shortSummary,
                    style = MaterialTheme.typography.subtitle2,
                    maxLines = 2,
                    color = MaterialTheme.colors.onSurface,
                    overflow = TextOverflow.Ellipsis
                )

            }
            Spacer(modifier = Modifier.width(12.dp))
            Image(
                painter = painterResource(id = R.drawable.dots_filed),
                contentDescription = "Menu",
                modifier = Modifier
                    .size(44.dp)
                    .padding(vertical = 8.dp),
            )

        }

    }

}


@Preview(showBackground = true)
@Composable
fun ItemCardPreview() {
    ItemCard(
        book = Book(
            bookCover = R.drawable.book1,
            authorName = stringResource(R.string.author_name),
            shortSummary = stringResource(R.string.lorem_ipsum)
        )
    )
}