package com.example.ch13anrtest

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.os.SystemClock.sleep
import kotlin.concurrent.thread
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ch13anrtest.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consume
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        val handler = object : Handler(){
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                binding.result.text = "sum: ${msg.arg1}"
            }
        }
        */
        val channel = Channel<Int> ()
        val backgroundScope = CoroutineScope(Dispatchers.Default)
        binding.click.setOnClickListener{
            backgroundScope.launch {
                var sum = 0L
                var time = measureTimeMillis {
                    for (i in 1..10) {
                        sleep(1000)
                        sum += i
                    }
                }
                Log.d("kkang", "time : $time")
                channel.send(sum.toInt())
            }
        }
        val mainScope = GlobalScope.launch (Dispatchers.Main){
            channel.consumeEach {
                binding.result.text = "sum: $it"
            }
        }
    }
}
