package com.example.myapplication.tuan4

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    var context: Context = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val btnGet=findViewById<Button>(R.id.btnGetData)
        val tvKQ=findViewById<TextView>(R.id.tvKQ)
        val fn1 = VolleyFn1()
        btnGet!!.SetOnClickListener {
            fn1.getAllData(context, tvKQ!!)
        }
    }
}