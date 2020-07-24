package com.github.jhamin0511.datamapping.data.mapper

import com.github.jhamin0511.datamapping.data.dto.OrderDto
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.data.vo.OrderVo

object OrderMapper {

    fun toEntity(dto: OrderDto): OrderEntity {
        return OrderEntity(
            dto.id,
            dto.name,
            dto.user.id,
            dto.user.name,
            dto.user.address.id,
            dto.user.address.label,
            dto.company.id,
            dto.company.name
        )
    }

    fun toEntityList(list: List<OrderDto>): MutableList<OrderEntity> {
        return list.map { toEntity(it) }.toMutableList()
    }

    fun toVo(e: OrderEntity): OrderVo {
        return OrderVo(
            e.id,
            e.name,
            e.userName,
            e.addressLabel,
            e.companyName
        )
    }

    fun toVoList(list: List<OrderEntity>): List<OrderVo> {
        return list.map { toVo(it) }
    }

}
