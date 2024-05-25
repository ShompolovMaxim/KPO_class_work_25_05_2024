package ru.hse.spring.security.example.repository

import org.springframework.stereotype.Repository
import ru.hse.spring.security.example.dto.DbNews
import ru.hse.spring.security.example.exception.NoSuchNewsException

@Repository
class NewsRepositoryImpl : NewsRepository {
    val newsList: MutableList<DbNews> = mutableListOf()

    override fun getAllNews(): List<DbNews> = newsList

    override fun addNews(news: DbNews) {
        newsList.add(news)
    }

    override fun editNews(news: DbNews) {
        val oldNews = newsList.find { it.name == news.name }
        if (oldNews == null) {
            throw NoSuchNewsException()
        } else {
            newsList.remove(oldNews)
            newsList.add(news)
        }
    }
}
