package ru.hse.spring.security.example.api

import ru.hse.spring.security.example.dto.ApiNews

interface NewsApi {
    fun getNews(): List<ApiNews>

    fun getAllNews(): List<ApiNews>

    fun addNews(apiNews: ApiNews)

    fun editNews(apiNews: ApiNews)
}