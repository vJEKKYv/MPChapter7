package com.example.ch13

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13.databinding.ActivityDetailBinding
import com.example.ch13.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Detail Activity"

        binding.finishBtn.setOnClickListener{
            val intent = Intent()
            intent.putExtra("resultData", "world")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}