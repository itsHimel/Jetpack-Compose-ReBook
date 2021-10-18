package com.pandaknife.rebook.ui.components

import androidx.compose.foundation.Image
import com.pandaknife.rebook.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pandaknife.rebook.data.Book

@Composable
fun BookItem(
    book: Book,
    modifier: Modifier = Modifier,
    onItemClick: () -> Unit,
) {


    Column(
        modifier = Modifier
            .width(140.dp)
            .height(245.dp)
            .padding(6.dp)
            .clickable { onItemClick }
    ) {
        Card(
            modifier = Modifier
                .height(180.dp)
                .width(130.dp)
        ) {
            Image(
                painter = painterResource(id = book.bookCover),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = book.authorName,
            style = MaterialTheme.typography.overline,
            color = MaterialTheme.colors.primary
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = book.shortSummary,
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.onSurface,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

    }

}

@Preview(showBackground = true)
@Composable
fun BookItemPreview() {
    BookItem(
        book = Book(
            bookCover = R.drawable.book1,
            authorName = stringResource(R.string.author_name),
            shortSummary = stringResource(R.string.lorem_ipsum)
        )
    ) {

    }
}