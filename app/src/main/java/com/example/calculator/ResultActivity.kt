package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val textv= findViewById<TextView>(R.id.t_v)
        val ans= intent.getIntExtra("gfg",0)
        textv.text=ans.toString()
    }
}