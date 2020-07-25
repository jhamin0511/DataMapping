package com.github.jhamin0511.datamapping.data.mapper

interface Mapper<DTO, ENTITY, VO> {

    fun toEntity(dto: DTO): ENTITY

    fun List<DTO>.toEntityList(): MutableList<ENTITY> {
        return this.map { toEntity(it) }.toMutableList()
    }

    fun toVo(e: ENTITY): VO

    fun List<ENTITY>.toVoList(): List<VO> {
        return this.map { toVo(it) }
    }

}
