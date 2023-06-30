package com.crud.simpleagedetector

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("SetTextI18n")
    fun onSubmit(view:View){
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        result.text="AGE: "+(currentYear-input.text.toString().toInt())
    }
}