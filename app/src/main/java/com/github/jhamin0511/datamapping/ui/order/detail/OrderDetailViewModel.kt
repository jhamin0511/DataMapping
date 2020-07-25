package com.github.jhamin0511.datamapping.ui.order.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.github.jhamin0511.datamapping.data.entity.OrderEntity

class OrderDetailViewModel(
    application: Application
) : AndroidViewModel(application) {

    // ========== BINDING ==========
    val bindEntity = MutableLiveData<OrderEntity>()

    // ========== OBSERVE ==========

    // ========== MODEL ==========
    fun initData(entity: OrderEntity) {
        bindEntity.value = entity
    }

}
