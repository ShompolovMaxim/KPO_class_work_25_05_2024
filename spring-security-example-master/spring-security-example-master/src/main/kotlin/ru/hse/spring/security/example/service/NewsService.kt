package ru.hse.spring.security.example.service

import ru.hse.spring.security.example.dto.ServiceNews

interface NewsService {
    fun getNews(): List<ServiceNews>

    fun getAllNews(): List<ServiceNews>

    fun addNews(serviceNews: ServiceNews)

    fun editNews(serviceNews: ServiceNews)
}