package com.github.jhamin0511.datamapping.data.mapper

internal interface MapperEntityToVo<ENTITY, VO> {

    fun toVo(e: ENTITY): VO

    fun List<ENTITY>.toVoList(): List<VO> {
        return this.map { toVo(it) }
    }

}
