package com.nailafaiza.denganmvvm3

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val counter = ObservableField(0)

    fun increaseCounter() {
        val current = counter.get()?:0
        counter.set(current+1)
    }
    fun decreaseCounter() {
        val current = counter.get()?:0
        counter.set(current-1)
    }
}