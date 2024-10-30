package com.example.newproject_base1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private var status = " "
    private  var countCheck = count

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val reset: Button = findViewById(R.id.reset)
        val counterText: TextView = findViewById(R.id.counter)

        button1.setOnClickListener {
            if (count < 10) {
                count += 1
            }
            WinLose(count, counterText)
        }
        button2.setOnClickListener {
            if (count < 10) {
                count += 2
            }
            WinLose(count, counterText)
        }
        reset.setOnClickListener {
            count = 0
            counterText.text = count.toString()
        }
    }

    fun WinLose(count: Int, counterText: TextView) {
        if (count == 10) {
            status = "Победа"
            counterText.text = status
        } else if (count == 11) {
            status = "Поражение"
            counterText.text = status
        } else {
            counterText.text = count.toString()
        }
    }
}