package com.example.actiondial_implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.Number)
        val num = "tel: " + et.text.toString()
        val btn = findViewById<Button>(R.id.Dial)

        btn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse(num)))
        }
    }
}