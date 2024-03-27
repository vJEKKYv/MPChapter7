package com.example.mpchapter7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mpchapter7.databinding.FrameLayoutBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        //setContentView(R.layout.relative_layout)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.grid_layout)
        /*
        val binding = FrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            binding.imageView.x += 100
            binding.imageView.y += 200
        }
         */
    }
}