package com.github.jhamin0511.datamapping.widget.recycler

interface RecyclerListener {

    fun onClick(position: Int)

    fun onLongClick(position: Int): Boolean = false

}
