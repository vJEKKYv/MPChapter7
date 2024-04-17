package com.example.ch11

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.example.ch11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Main Activity"
        binding.button.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        val menuItem = menu?.findItem(R.id.menu_search)
        val searchView = menuItem?.actionView as SearchView
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                Toast.makeText(applicationContext,query, Toast.LENGTH_SHORT).show()
                return true
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                //Toast.makeText(applicationContext,newText, Toast.LENGTH_SHORT).show()
                return true
            }
        })
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu1 -> startActivity(Intent(this, MainActivity2::class.java))
            R.id.menu2 -> startActivity(Intent(this, MainActivity3::class.java))
            R.id.menu3 -> Toast.makeText(this,"세번째 메뉴", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}