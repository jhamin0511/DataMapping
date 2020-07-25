package com.github.jhamin0511.datamapping.ui.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.github.jhamin0511.datamapping.R

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onValue()
        onView()
        onObserve()
        onEvent()

        checkHasAppcompatToolbar()
    }

    abstract fun onValue()

    abstract fun onView()

    abstract fun onObserve()

    abstract fun onEvent()

    private fun checkHasAppcompatToolbar() {
        val toolbar: Toolbar? = findViewById(R.id.toolbar)
        if (toolbar != null) {
            setSupportActionBar(toolbar)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}
