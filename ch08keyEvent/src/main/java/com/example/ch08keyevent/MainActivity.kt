package com.example.ch08keyevent

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed(){
                Log.d("kkang", "CallBack()-BACK Button 누름. ")
            }
        })

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode){
            KeyEvent.KEYCODE_BACK -> Log.d("kkang", "BACK Button 누름. ")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("kkang", "Volumm Up Button 누름. ")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("kkang", "Volumm Down Button 누름. ")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onBackPressed() {
        Log.d("kkang", "onBackPressed()-BACK Button 누름. ")
        super.onBackPressed()
    }
}