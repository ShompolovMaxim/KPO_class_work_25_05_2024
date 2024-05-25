package ru.hse.spring.security.example.dto

data class ApiNews(
    val name: String,
    val text: String,
    val isDeleted: Boolean
)
