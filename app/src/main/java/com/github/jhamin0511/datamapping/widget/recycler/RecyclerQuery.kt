package com.github.jhamin0511.datamapping.widget.recycler

interface RecyclerQuery<VO> {

    fun insert(vo: VO, position: Int)

    fun insert(list: List<VO>)

    fun update(vo: VO, position: Int)

    fun remove(position: Int)

}
