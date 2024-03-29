package com.example.chap08

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang", "Main Touch down event X: ${event.x}, rawX: ${event.rawX}")
            }
        }
        return super.onTouchEvent(event)
    }
}
class MyTextView(context: Context, attrs: AttributeSet):
        androidx.appcompat.widget.AppCompatTextView(context, attrs){
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                Log.d("kkang", "Main Touch down event X: ${event.x}, rawX: ${event.rawX}")
            }
        }
        return super.onTouchEvent(event)
    }
        }