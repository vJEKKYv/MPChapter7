package com.example.ch13

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Main Activity"
        binding.button.setOnClickListener{
            //intent로 detail에 data 전송.
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("data1", "Hello")
            intent.putExtra("data2", 12486)
            //전송 후 intent 실행. data를 보낸 레이아웃 싫행
            startActivity(intent)
        }
    }
}