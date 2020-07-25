package com.github.jhamin0511.datamapping.data.mapper

interface MapperDtoToEntity<DTO, ENTITY> {

    fun toEntity(dto: DTO): ENTITY

    fun List<DTO>.toEntityList(): MutableList<ENTITY> {
        return this.map { toEntity(it) }.toMutableList()
    }

}
