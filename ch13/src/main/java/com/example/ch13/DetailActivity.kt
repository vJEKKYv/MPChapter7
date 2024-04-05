package com.example.ch13

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Detail Activity"

        val str = intent.getStringExtra("data1")
        val value = intent.getIntExtra("data2", 0)
        binding.button.text = str + ":"+value

        binding.button.setOnClickListener{finish()}
    }
}