package com.github.jhamin0511.datamapping.ui.order.detail

import android.content.Context
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import com.github.jhamin0511.datamapping.R
import com.github.jhamin0511.datamapping.data.entity.OrderEntity
import com.github.jhamin0511.datamapping.databinding.OrderDetailActivityBinding
import com.github.jhamin0511.datamapping.key.ENTITY
import com.github.jhamin0511.datamapping.ui.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class OrderDetailActivity : BaseActivity() {

    companion object {
        fun getStart(context: Context, entity: OrderEntity): Intent {
            return Intent(context, OrderDetailActivity::class.java).apply {
                putExtra(ENTITY, entity)
            }
        }
    }

    private lateinit var binding: OrderDetailActivityBinding
    private val viewModel: OrderDetailViewModel by viewModel()

    override fun onValue() {
        val entity: OrderEntity = intent.getParcelableExtra(ENTITY)!!

        viewModel.initData(entity)
    }

    override fun onView() {
        binding = DataBindingUtil.setContentView(this, R.layout.order_detail_activity)
        binding.lifecycleOwner = this
        binding.vm = viewModel
    }

    override fun onObserve() {
    }

    override fun onEvent() {
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.save_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.save -> {

            }
        }

        return super.onOptionsItemSelected(item)
    }
}
