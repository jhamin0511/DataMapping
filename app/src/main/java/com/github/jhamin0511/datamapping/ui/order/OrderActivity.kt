package com.github.jhamin0511.datamapping.ui.order

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.*
import com.github.jhamin0511.datamapping.R
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.databinding.OrderActivityBinding
import com.github.jhamin0511.datamapping.key.DETAIL
import com.github.jhamin0511.datamapping.ui.base.BaseActivity
import com.github.jhamin0511.datamapping.ui.order.detail.OrderDetailActivity
import com.github.jhamin0511.datamapping.viewmodel.EventObserver
import org.koin.android.viewmodel.ext.android.viewModel

class OrderActivity : BaseActivity() {

    private lateinit var binding: OrderActivityBinding
    private val viewModel: OrderViewModel by viewModel()
    private lateinit var adapter: OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onValue() {
        adapter = OrderAdapter(viewModel)
        viewModel.setRecyclerQuery(adapter)
    }

    override fun onView() {
        binding = DataBindingUtil.setContentView(this, R.layout.order_activity)
        binding.lifecycleOwner = this
        binding.list.adapter = adapter
        binding.list.addItemDecoration(DividerItemDecoration(this, VERTICAL))
    }

    override fun onObserve() {
        viewModel.observerStartDetail.observe(this, EventObserver(this::startOrderDetail))
    }

    override fun onEvent() {
    }

    private fun startOrderDetail(it: OrderEntity) {
        val intent = OrderDetailActivity.getStart(this, it)
        startActivityForResult(intent, DETAIL)
    }

}
