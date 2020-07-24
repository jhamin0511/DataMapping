package com.github.jhamin0511.datamapping.ui.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.github.jhamin0511.datamapping.R
import com.github.jhamin0511.datamapping.data.vo.OrderVo
import com.github.jhamin0511.datamapping.databinding.OrderListItemBinding
import com.github.jhamin0511.datamapping.widget.recycler.BaseRecyclerAdapter
import com.github.jhamin0511.datamapping.widget.recycler.BaseViewHolder
import com.github.jhamin0511.datamapping.widget.recycler.RecyclerListener

class OrderAdapter(
    private val listener: RecyclerListener
) : BaseRecyclerAdapter<OrderVo>() {

    inner class Holder(
        itemView: View
    ) : BaseViewHolder<OrderVo>(itemView, listener) {

        private val binding: OrderListItemBinding = DataBindingUtil.bind(itemView)!!

        override fun bindView(vo: OrderVo) {
            binding.vo = vo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.order_list_item, parent, false)

        return Holder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is Holder) {
            holder.bindView(items[position])
        }
    }

}
