package com.pandaknife.rebook.repository

import com.pandaknife.rebook.R
import com.pandaknife.rebook.data.Book

class BookRepository {

    fun getBooks(): List<Book> {

        return listOf(
            Book(
                bookCover = R.drawable.book,
                authorName = "Matt Ridlly",
                shortSummary = "Learning to love yourself"
            ),
            Book(
                bookCover = R.drawable.book1,
                authorName = "Eric Jorgenson",
                shortSummary = "The Almanack of Naval Ravikant: A Guide To Wealth And Happiness"
            ),
            Book(
                bookCover = R.drawable.book,
                authorName = "Matt Ridlly",
                shortSummary = "Learning to love yourself"
            ),
            Book(
                bookCover = R.drawable.book1,
                authorName = "Matt Ridlly",
                shortSummary = "The Almanack of Naval Ravikant: A Guide To Wealth And Happiness"
            ),
            Book(
                bookCover = R.drawable.book,
                authorName = "Eric Jorgenson",
                shortSummary = "Learning to love yourself"
            ),
            Book(
                bookCover = R.drawable.book1,
                authorName = "Matt Ridlly",
                shortSummary = "The Almanack of Naval Ravikant: A Guide To Wealth And Happiness"
            ),
            Book(
                bookCover = R.drawable.book,
                authorName = "Matt Ridlly",
                shortSummary = "The Almanack of Naval Ravikant: A Guide To Wealth And Happiness"
            ),
            Book(
                bookCover = R.drawable.book1,
                authorName = "Eric Jorgenson",
                shortSummary = "Learning to love yourself"
            ),
            Book(
                bookCover = R.drawable.book,
                authorName = "Matt Ridlly",
                shortSummary = "Learning to love yourself"
            ),
            Book(
                bookCover = R.drawable.book1,
                authorName = "Matt Ridlly",
                shortSummary = "Learning to love yourself"
            )
        )

    }
}