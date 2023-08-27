package com.basew.forrebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloWorld()
        setupUI()
    }

    private fun helloWorld() {
        println("Hello, World!")
    }

    private fun setupUI() {
        println("UI is set up.")
    }
}