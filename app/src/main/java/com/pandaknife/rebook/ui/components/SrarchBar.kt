package com.pandaknife.rebook.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pandaknife.rebook.R

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        var textState by remember { mutableStateOf("") }

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            value = textState,
            placeholder = {
                Text(
                    text = "Enter the title of the book or author",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    style = MaterialTheme.typography.body2,
                    color = Color.Gray
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.LightGray.copy(alpha = 0.5f),
                disabledLabelColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            onValueChange = { textState = it },
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.Gray),
                    modifier = Modifier
                        .size(24.dp)
                        .padding(2.dp)
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    SearchBar()
}
