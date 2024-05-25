package ru.hse.spring.security.example.adapter

import ru.hse.spring.security.example.dto.ApiNews
import ru.hse.spring.security.example.dto.ServiceNews

interface ApiServiceNewsAdapter {
    fun api2Service(apiNews: ApiNews): ServiceNews

    fun service2Api(serviceNews: ServiceNews): ApiNews
}