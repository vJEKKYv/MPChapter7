package com.example.mpchapter7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mpchapter7.databinding.ActivityMainBinding
import com.example.mpchapter7.databinding.FrameLayoutBinding
import com.example.mpchapter7.databinding.KakaotalkBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = FrameLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        //setContentView(R.layout.relative_layout)
        //etContentView(R.layout.activity_main)
        binding.button.setOnClickListener{
            binding.imageView.x += 100
            binding.imageView.y += 200
        }
    }
}