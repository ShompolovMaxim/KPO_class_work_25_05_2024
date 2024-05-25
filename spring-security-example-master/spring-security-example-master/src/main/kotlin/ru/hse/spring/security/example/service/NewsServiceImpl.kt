package ru.hse.spring.security.example.service

import org.springframework.stereotype.Service
import ru.hse.spring.security.example.adapter.ServiceDbNewsAdapterImpl
import ru.hse.spring.security.example.dto.ServiceNews
import ru.hse.spring.security.example.repository.NewsRepository

@Service
class NewsServiceImpl(
    val newsRepository: NewsRepository
) : NewsService {
    override fun getNews(): List<ServiceNews> =
        newsRepository.getAllNews().map { ServiceDbNewsAdapterImpl().db2Service(it) }.filter { !it.isDeleted }

    override fun getAllNews(): List<ServiceNews> =
        newsRepository.getAllNews().map { ServiceDbNewsAdapterImpl().db2Service(it) }

    override fun addNews(serviceNews: ServiceNews) =
        newsRepository.addNews(ServiceDbNewsAdapterImpl().service2Db(serviceNews))

    override fun editNews(serviceNews: ServiceNews) =
        newsRepository.editNews(ServiceDbNewsAdapterImpl().service2Db(serviceNews))
}