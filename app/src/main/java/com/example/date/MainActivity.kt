package com.example.date

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.date.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun onClick3(view:View){
        val i= Intent(this,MainActivity2::class.java)
        i.putExtra("key", bindingClass.edName.text.toString())
        i.putExtra("key1", bindingClass.edNumb.text.toString())
        startActivity(i)

    }


}