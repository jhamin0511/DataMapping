package com.github.jhamin0511.datamapping.di

import com.github.jhamin0511.datamapping.ui.order.OrderViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { OrderViewModel(get(), get()) }
}
