package com.example.ch13

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Main Activity"

        val requestLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            val resultData = it.data?.getStringExtra("result")
            binding.resultText.text = "result: $resultData"
        }
        binding.newActivity.setOnClickListener{
            intent.setPackage("com.example.ch13.DetailActivity")
            val intent = Intent(this, DetailActivity::class.java)
            requestLauncher.launch(intent)
        }
    }
}