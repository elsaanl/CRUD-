package com.example.firebase1
import java.io.Serializable

data class News(
    var id: String? = null,
    val desc: String = "",
    val img: String = "",
    val short_desc: String = "",
    val title: String = "",

): Serializable
