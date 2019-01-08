package com.android.ktempconvert

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var btnC: Button
    lateinit var c: RadioButton
    lateinit var f: RadioButton
    var auxC: Boolean = false
    var auxF: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.valorTemp)
        btnC = findViewById(R.id.coverterBtn)
        c = findViewById(R.id.celciusR)
        f = findViewById(R.id.fahrenheitR)

        btnC.setOnClickListener {
            if (!editText.equals("")) {
                converter(it)
            }
        }

    }

    fun converter(view: View) {
        var temp: Double = editText.text.toString().toDouble()


        if (c.isChecked) {

            if (auxC) {
                Toast.makeText(applicationContext, "Digite outro valor", Toast.LENGTH_LONG).show()
            } else {
                temp = (temp - 32) * 5 / 9
                auxC = true
                auxF = false
                editText.setText(temp.toString())
            }
        } else if (f.isChecked) {
            if (auxF) {
                Toast.makeText(applicationContext, "Digite outro valor", Toast.LENGTH_LONG).show()
            } else {
                temp = temp * 9 / 5 + 32
                auxC = false
                auxF = true
                editText.setText(temp.toString())
            }
        }
    }
}
