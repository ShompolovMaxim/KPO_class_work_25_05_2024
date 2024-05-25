package ru.hse.spring.security.example.dto

data class DbNews(
    val name: String,
    val text: String,
    val isDeleted: Boolean
)