package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    var et1: EditText?=null
    var et2: EditText?=null
    var bt1: Button?=null
    var bt2: Button?=null
    var bt3: Button?=null
    var bt4: Button?=null
    var results=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
        setuponclick()
    }
    fun initviews(){
        et1=findViewById(R.id.f_n)
        et2=findViewById(R.id.s_n)
        bt1=findViewById(R.id.add)
        bt2=findViewById(R.id.sub)
        bt3=findViewById(R.id.mul)
        bt4=findViewById(R.id.div)

    }
    fun isValid():Boolean{
        return (et1?.text?.isEmpty() == false && et2?.text?.isEmpty() == false)
    }
    fun setuponclick(){

        bt1?.setOnClickListener{
            if(isValid())
            {
                results=et1?.text.toString().toInt()+et2?.text.toString().toInt()
                //Toast.makeText(this, "$results", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,ResultActivity::class.java).run {
                    putExtra("gfg",results)
                })


            }
            else
                Toast.makeText(this, "pls enter the number", Toast.LENGTH_SHORT).show()
        }
        bt2?.setOnClickListener{
            if(isValid())
            {
                results=et1?.text.toString().toInt()-et2?.text.toString().toInt()
                startActivity(Intent(this,ResultActivity::class.java).run {
                    putExtra("gfg",results)
                })
            }
            else
                Toast.makeText(this, "pls enter the number", Toast.LENGTH_SHORT).show()
        }
        bt3?.setOnClickListener{
            if(isValid())
            {
                results=et1?.text.toString().toInt()*et2?.text.toString().toInt()
                startActivity(Intent(this,ResultActivity::class.java).run {
                    putExtra("gfg",results)
                })

            }
            else
                Toast.makeText(this, "pls enter the number", Toast.LENGTH_SHORT).show()
        }
        bt4?.setOnClickListener{
            if(isValid())
            {
                results=et1?.text.toString().toInt()/et2?.text.toString().toInt()
                startActivity(Intent(this,ResultActivity::class.java).run {
                    putExtra("gfg",results)
                })
            }
            else
                Toast.makeText(this, "pls enter the number", Toast.LENGTH_SHORT).show()
        }
    }
}