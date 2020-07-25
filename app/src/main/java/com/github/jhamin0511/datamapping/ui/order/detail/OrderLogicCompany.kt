package com.github.jhamin0511.datamapping.ui.order.detail

import androidx.lifecycle.MutableLiveData
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.viewmodel.update

class OrderLogicCompany(
    private val bindEntity: MutableLiveData<OrderEntity>
) : OrderLogic {

    override fun onChangedName(value: String) {
        bindEntity.update { companyName = value }
    }

}
