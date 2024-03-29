package com.example.ch08changehandler

import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ch08changehandler.databinding.ActivityMainBinding
//아래 두 방식은 같은 방식이나 외부 클래스 구현이냐 메인 클래스에 상속을 받냐 차이이다.
/*
class MyEventHandler : CompoundButton.OnCheckedChangeListener{
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("kkang", "체크박스 클릭. ")
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkbox.setOnCheckedChangeListener(MyEventHandler())
    }
}

 */
class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkbox.setOnCheckedChangeListener(this)
    }
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        Log.d("kkang", "체크박스 클릭")
    }
}
