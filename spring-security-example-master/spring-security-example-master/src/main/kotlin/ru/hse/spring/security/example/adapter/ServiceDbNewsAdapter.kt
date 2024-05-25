package ru.hse.spring.security.example.adapter

import ru.hse.spring.security.example.dto.DbNews
import ru.hse.spring.security.example.dto.ServiceNews

interface ServiceDbNewsAdapter {
    fun db2Service(dbNews: DbNews): ServiceNews

    fun service2Db(serviceNews: ServiceNews): DbNews
}