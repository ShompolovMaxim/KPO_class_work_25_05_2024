package ru.hse.spring.security.example.controller

import org.springframework.web.bind.annotation.*
import ru.hse.spring.security.example.adapter.ApiServiceNewsAdapterImpl
import ru.hse.spring.security.example.api.NewsApi
import ru.hse.spring.security.example.dto.ApiNews
import ru.hse.spring.security.example.service.NewsService

@RestController
@RequestMapping
class NewsController(
    val newsService: NewsService
) : NewsApi {
    @GetMapping("/user/news")
    override fun getNews() = newsService.getNews().map { ApiServiceNewsAdapterImpl().service2Api(it) }

    @GetMapping("/admin/news")
    override fun getAllNews() =
        newsService.getAllNews().map { ApiServiceNewsAdapterImpl().service2Api(it) }

    @PostMapping("/admin/news")
    override fun addNews(apiNews: ApiNews) = newsService.addNews(ApiServiceNewsAdapterImpl().api2Service(apiNews))

    @PutMapping("/admin/news")
    override fun editNews(apiNews: ApiNews) = newsService.editNews(ApiServiceNewsAdapterImpl().api2Service(apiNews))
}