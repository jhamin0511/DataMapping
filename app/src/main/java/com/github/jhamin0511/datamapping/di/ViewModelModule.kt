package com.github.jhamin0511.datamapping.di

import com.github.jhamin0511.datamapping.ui.order.OrderViewModel
import com.github.jhamin0511.datamapping.ui.order.detail.OrderDetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { OrderViewModel(get(), get()) }
    viewModel { OrderDetailViewModel(get()) }
}
