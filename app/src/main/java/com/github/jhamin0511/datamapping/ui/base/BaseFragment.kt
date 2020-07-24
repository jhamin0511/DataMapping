package com.github.jhamin0511.datamapping.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

  @LayoutRes
  protected abstract fun getLayoutId(): Int

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    onValue(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(getLayoutId(), container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    onView(view, savedInstanceState)
    onEvent()
  }

  abstract fun onValue(savedInstanceState: Bundle?)

  abstract fun onView(view: View, savedInstanceState: Bundle?)

  abstract fun onEvent()

}
