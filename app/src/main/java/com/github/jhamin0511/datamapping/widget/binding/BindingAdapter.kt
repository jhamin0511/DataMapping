package com.github.jhamin0511.datamapping.widget.binding

import android.view.View
import androidx.databinding.BindingAdapter
import com.github.jhamin0511.datamapping.widget.listener.setOnSafeClickListener

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("bindSafeOnClick")
    fun bindSafeOnClick(v: View, listener: View.OnClickListener) {
        v.setOnSafeClickListener { listener.onClick(v) }
    }

}
