package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll = findViewById<Button>(R.id.buttonRoll)
        val textView11 = findViewById<TextView>(R.id.textView11)
        val textView12 = findViewById<TextView>(R.id.textView12)
        val textView13 = findViewById<TextView>(R.id.textView13)
        val textView21 = findViewById<TextView>(R.id.textView21)
        val textView22 = findViewById<TextView>(R.id.textView22)
        val textView23 = findViewById<TextView>(R.id.textView23)
        val textView31 = findViewById<TextView>(R.id.textView31)
        val textView32 = findViewById<TextView>(R.id.textView32)
        val textView33 = findViewById<TextView>(R.id.textView33)
        var x = 0;

        fun CleanAllTextView() {
            textView11.setText("")
            textView12.setText("")
            textView13.setText("")
            textView21.setText("")
            textView22.setText("")
            textView23.setText("")
            textView31.setText("")
            textView32.setText("")
            textView33.setText("")
        }

        buttonRoll.setOnClickListener() {
            ++x;
            if (x % 3 == 1) {
                CleanAllTextView();
                textView11.setText((x).toString())
                textView21.setText((x).toString())
                textView31.setText((x).toString())

            }
            if (x % 3 == 2) {
                CleanAllTextView();
                textView12.setText((x).toString())
                textView22.setText((x).toString())
                textView32.setText((x).toString())

            }
            if (x % 3 == 0) {
                CleanAllTextView();
                textView13.setText((x).toString())
                textView23.setText((x).toString())
                textView33.setText((x).toString())

            }


        }
    }
}