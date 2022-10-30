package com.nailafaiza.denganmvvm2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.DataBindingUtil.setContentView(R.layout.activity_main)
        binding.viewModel = viewModel
    }
}