package com.github.jhamin0511.datamapping.ui.order.detail

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.viewmodel.Event
import com.github.jhamin0511.datamapping.viewmodel.event

class OrderDetailViewModel(
    application: Application
) : AndroidViewModel(application) {

    // ========== BINDING ==========
    val bindEntity = MutableLiveData<OrderEntity>()

    fun bindOnClickName(v: View) {
        observeOrderEdit.event(Pair(logicName, bindEntity.value?.name ?: ""))
    }

    fun bindOnClickUser(v: View) {
        observeOrderEdit.event(Pair(logicUser, bindEntity.value?.userName ?: ""))
    }

    fun bindOnClickAddress(v: View) {
        observeOrderEdit.event(Pair(logicAddress, bindEntity.value?.addressLabel ?: ""))
    }

    fun bindOnClickCompany(v: View) {
        observeOrderEdit.event(Pair(logicCompany, bindEntity.value?.companyName ?: ""))
    }

    // ========== OBSERVE ==========
    val observeOrderEdit = MutableLiveData<Event<Pair<OrderLogic, String>>>()

    // ========== MODEL ==========
    private val logicName = OrderLogicName(bindEntity)
    private val logicUser = OrderLogicUser(bindEntity)
    private val logicAddress = OrderLogicAddress(bindEntity)
    private val logicCompany = OrderLogicCompany(bindEntity)

    fun initData(entity: OrderEntity) {
        bindEntity.value = entity
    }

}
