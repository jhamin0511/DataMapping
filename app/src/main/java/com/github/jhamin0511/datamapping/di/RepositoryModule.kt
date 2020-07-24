package com.github.jhamin0511.datamapping.di

import com.github.jhamin0511.datamapping.repository.OrderRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { OrderRepository() }
}
