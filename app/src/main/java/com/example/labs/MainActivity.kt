package com.example.labs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button)
        buttonClick.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ MainActivity2::class.java).apply { putExtra("name", "Paulo Amorim") }

            val toast = Toast.makeText(this, "starting", Toast.LENGTH_LONG) // in Activity
            toast.show()

            startActivity(intent)
        }
    }
}