package com.example.date

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.date.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val name=intent.getStringExtra("key")
        val number=intent.getStringExtra("key1")

        bindingClass.tvResult.text= "Имя:$name"
        bindingClass.tvResult2.text= "Телефон:$number"
    }
fun onClick1(view: View){
    val i= Intent(this,MainActivity::class.java)
    startActivity(i)
}

    }
