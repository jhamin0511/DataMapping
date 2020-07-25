package com.github.jhamin0511.datamapping.ui.order

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.data.mapper.OrderMapper.toVoList
import com.github.jhamin0511.datamapping.data.vo.OrderVo
import com.github.jhamin0511.datamapping.repository.OrderRepository
import com.github.jhamin0511.datamapping.widget.recycler.RecyclerListener
import com.github.jhamin0511.datamapping.widget.recycler.RecyclerQuery

class OrderViewModel(
    application: Application,
    orderRepository: OrderRepository
) : AndroidViewModel(application), RecyclerListener {

    // ========== BINDING ==========

    // ========== OBSERVE ==========

    // ========== MODEL ==========
    val list: MutableList<OrderEntity> = orderRepository.getOrderList()

    private lateinit var recyclerQuery: RecyclerQuery<OrderVo>

    fun setRecyclerQuery(query: RecyclerQuery<OrderVo>) {
        recyclerQuery = query

        recyclerQuery.insert(list.toVoList())
    }

    override fun onClick(position: Int) {
    }

}
