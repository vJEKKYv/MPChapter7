package com.example.ch13anrtest

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.os.SystemClock.sleep
import kotlin.concurrent.thread
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13anrtest.databinding.ActivityMainBinding
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val handler = object : Handler(){
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                binding.result.text = "sum: ${msg.arg1}"
            }
        }

        binding.click.setOnClickListener{
            var sum = 0L
            var time = measureTimeMillis {
                for (i in 1..10){
                    sleep(1000)
                    sum +=i
                }
            }
            Log.d("kkang", "time : $time")
        }
    }
}
