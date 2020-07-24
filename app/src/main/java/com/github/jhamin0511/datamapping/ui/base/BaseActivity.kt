package com.github.jhamin0511.datamapping.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onValue()
        onView()
        onEvent()
    }

    abstract fun onValue()

    abstract fun onView()

    abstract fun onEvent()

}
