package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R = resource class
        setContentView(R.layout.activity_main)

        //Write UI handler here
        //Variable declaration; 1) val = value, 2) var = variable
        val textViewName: TextView = findViewById(R.id.textViewName)
        val imageViewQRCode = findViewById<ImageView>(R.id.imageViewQRCode)
        val buttonShow: Button = findViewById(R.id.buttonShow)
        imageViewQRCode.visibility = View.INVISIBLE
        buttonShow.setOnClickListener {
            textViewName.visibility = View.VISIBLE
            imageViewQRCode.visibility = View.VISIBLE
        }

    }
}