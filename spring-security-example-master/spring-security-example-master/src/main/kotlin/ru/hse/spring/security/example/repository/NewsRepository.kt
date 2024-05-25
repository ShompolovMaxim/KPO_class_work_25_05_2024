package ru.hse.spring.security.example.repository

import ru.hse.spring.security.example.dto.DbNews

interface NewsRepository {
    fun getAllNews(): List<DbNews>

    fun addNews(news: DbNews)

    fun editNews(news: DbNews)
}