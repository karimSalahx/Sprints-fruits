package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fruit_details.*

class FruitDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)
        val text=intent.getStringExtra("text")
        val image=intent.getIntExtra("image",  R.drawable.apple)
        textView2.text = text
        imageView.setImageResource(image)


    }
}