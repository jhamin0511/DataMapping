package com.github.jhamin0511.datamapping.viewmodel

import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.update(update: T.() -> Unit) {
  this.value = this.value?.apply {
    update(this)
  }
}

fun <T> MutableLiveData<Event<T>>.event(value: T?) {
  this.value = Event(value)
}
