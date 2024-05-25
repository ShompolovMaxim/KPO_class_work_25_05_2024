package ru.hse.spring.security.example.adapter

import ru.hse.spring.security.example.dto.ApiNews
import ru.hse.spring.security.example.dto.ServiceNews


class ApiServiceNewsAdapterImpl : ApiServiceNewsAdapter {
    override fun api2Service(apiNews: ApiNews) = ServiceNews(apiNews.name, apiNews.text, apiNews.isDeleted)

    override fun service2Api(serviceNews: ServiceNews) =
        ApiNews(serviceNews.name, serviceNews.text, serviceNews.isDeleted)
}