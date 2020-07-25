package com.github.jhamin0511.datamapping.repository

import com.github.jhamin0511.datamapping.data.dto.OrderDto
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.data.mapper.OrderMapper.toEntityList

class OrderRepository {

    fun getOrderList(): MutableList<OrderEntity> {
        val list: MutableList<OrderDto> = mutableListOf()

        for (i in 1..2000) {
            list.add(OrderDto(i))
        }

        return list.toEntityList()
    }

}
