package com.github.jhamin0511.datamapping.widget.listener

import android.os.SystemClock
import android.view.View
import androidx.annotation.VisibleForTesting

class SafeOnClickListener(
  private val interval: Long = 1000,
  private val onSafeClick: (View) -> Unit
) : View.OnClickListener {

  private var lastTime: Long = 0L

  override fun onClick(v: View) {
    if (checkClicked()) {
      return
    }

    onSafeClick(v)
  }

  @VisibleForTesting
  fun checkClicked(): Boolean {
    val currentTime = SystemClock.elapsedRealtime()
    val clicked = currentTime - lastTime < interval

    if (!clicked) {
      lastTime = SystemClock.elapsedRealtime()
    }

    return clicked
  }

}

fun View.setOnSafeClickListener(
  onClick: (View) -> Unit
) {
  val onClickListener = SafeOnClickListener(onSafeClick = onClick)
  setOnClickListener(onClickListener)
}
