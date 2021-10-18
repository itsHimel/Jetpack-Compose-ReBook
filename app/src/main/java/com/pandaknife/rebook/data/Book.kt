package com.pandaknife.rebook.data

data class Book(
    val bookCover: Int,
    val bookName: String? = null,
    val authorName: String,
    val shortSummary: String
)
