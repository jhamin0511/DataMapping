package com.github.jhamin0511.datamapping.widget.recycler

import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class BaseRecyclerAdapter<VO>
    : Adapter<ViewHolder>(), RecyclerQuery<VO> {

    protected val items: MutableList<VO> = mutableListOf()

    override fun getItemCount() = items.size

    override fun insert(vo: VO, position: Int) {
        items.add(position, vo)
        notifyItemInserted(position)
    }

    override fun insert(list: List<VO>) {
        val oldEndPosition = items.size - 1
        items.addAll(list)
        notifyItemRangeInserted(oldEndPosition, items.size - 1)
    }

    override fun update(vo: VO, position: Int) {
        items[position] = vo
        notifyItemChanged(position)
    }

    override fun remove(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
    }

}
