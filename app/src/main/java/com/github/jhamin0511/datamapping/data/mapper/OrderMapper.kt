package com.github.jhamin0511.datamapping.data.mapper

import com.github.jhamin0511.datamapping.data.dto.OrderDto
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.data.vo.OrderVo

object OrderMapper :
    MapperDtoToEntity<OrderDto, OrderEntity>,
    MapperEntityToVo<OrderEntity, OrderVo> {

    override fun toEntity(dto: OrderDto): OrderEntity {
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

    override fun toVo(e: OrderEntity): OrderVo {
        return OrderVo(
            e.id,
            e.name,
            e.userName,
            e.addressLabel,
            e.companyName
        )
    }

}
