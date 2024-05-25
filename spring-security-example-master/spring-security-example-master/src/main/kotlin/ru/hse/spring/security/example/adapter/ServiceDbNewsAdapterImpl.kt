package ru.hse.spring.security.example.adapter

import ru.hse.spring.security.example.dto.DbNews
import ru.hse.spring.security.example.dto.ServiceNews

class ServiceDbNewsAdapterImpl : ServiceDbNewsAdapter {
    override fun db2Service(dbNews: DbNews) = ServiceNews(dbNews.name, dbNews.text, dbNews.isDeleted)

    override fun service2Db(serviceNews: ServiceNews) =
        DbNews(serviceNews.name, serviceNews.text, serviceNews.isDeleted)
}