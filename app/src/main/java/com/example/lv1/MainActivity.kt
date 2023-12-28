package com.example.lv1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener {
            // Promijeni tekst u TextView komponenti
            textView.text = "Pozdrav svijete"
        }
    }
}