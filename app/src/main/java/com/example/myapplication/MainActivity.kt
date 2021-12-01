package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView
    lateinit var newTextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.up_text_view)
        newTextButton = findViewById(R.id.center_button)
        newTextButtinClick()
    }

    fun newTextButtinClick() {
        newTextButton.setOnClickListener {
           // helloTextView.text = Random.nextInt().toString()
            Toast.makeText(this,"Hello"+Random.nextInt().toString(),Toast.LENGTH_LONG).show()
        }
    }

}