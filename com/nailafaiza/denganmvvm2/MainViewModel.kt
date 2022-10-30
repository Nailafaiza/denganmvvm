package com.nailafaiza.denganmvvm2

import  androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import java.util.Observable

class MainViewModel: viewModel() {
    val counter = ObservableField(0)
    fun increaseCounter() {
        val current = counter.get() ?: 0
        counter.set(current+1)
    }
    fun decreaseCounter() {
        val current = counter.get() ?: 0
        counter.set(current-1)
    }
}