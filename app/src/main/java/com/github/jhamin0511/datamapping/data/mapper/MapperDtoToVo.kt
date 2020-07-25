package com.github.jhamin0511.datamapping.data.mapper

internal interface MapperDtoToVo<DTO, VO> {

    fun toVo(dto: DTO): VO

    fun List<DTO>.toVoList(): List<VO> {
        return this.map { toVo(it) }
    }

}
