package com.example.androidstartproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        toplama.setOnClickListener(View.OnClickListener {
                val sonuc : Int =  editText.text.toString().toInt() + editText2.text.toString().toInt()
                textView3.text = sonuc.toString()

        })
        cikartma.setOnClickListener(View.OnClickListener {
            val sonuc : Int = editText.text.toString().toInt() - editText2.text.toString().toInt()
            textView3.text = sonuc.toString()
        })
        carpma.setOnClickListener(View.OnClickListener {
            val sonuc : Int = editText.text.toString().toInt() * editText2.text.toString().toInt()
            textView3.text = sonuc.toString()
        })
        bolme.setOnClickListener(View.OnClickListener {
            val deger2 = editText2.text.toString().toInt()
            if (deger2 == 0){
                textView3.text= "payda sifir olamaz"
            }
            else{
                val sonuc : Int = editText.text.toString().toInt() / editText2.text.toString().toInt()
                textView3.text = sonuc.toString()
            }
        })




    }



}
