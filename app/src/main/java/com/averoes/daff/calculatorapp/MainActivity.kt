package com.averoes.daff.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.averoes.daff.calculatorapp.R.id.*
import com.averoes.daff.calculatorapp.R.string.hasil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tambah.setOnClickListener {
            if (validate()) opertator("+")
            else Toast.makeText(this, "Harus Diisi", Toast.LENGTH_SHORT).show()
        }

        btn_kurang.setOnClickListener {
            if (validate()) opertator("-")
            else Toast.makeText(this, "Harus Diisi", Toast.LENGTH_SHORT).show()
        }

        btn_bagi.setOnClickListener {
            if (validate()) opertator("/")
            else Toast.makeText(this, "Harus Diisi", Toast.LENGTH_SHORT).show()
        }

        btn_kali.setOnClickListener {
            if (validate()) opertator("*")
            else Toast.makeText(this, "Harus Diisi", Toast.LENGTH_SHORT).show()
        }

        btn_clear.setOnClickListener {
            clear()
        }
    }

    private fun opertator(operator: String) {
        when (operator) {
            "+" -> tambah()
            "-" -> kurang()
            "*" -> kali()
            "/" -> bagi()
        }
    }

    private fun tambah() {
        val hasil = edt_satu.text.toString().toInt() + edt_dua.text.toString().toInt()
        tv_result.text = hasil.toString()
    }

    private fun kurang() {
        val hasil = edt_satu.text.toString().toInt() - edt_dua.text.toString().toInt()
        tv_result.text = hasil.toString()
    }

    private fun kali() {

        val hasil = edt_satu.text.toString().toInt() * edt_dua.text.toString().toInt()
        tv_result.text = hasil.toString()


    }

    private fun bagi() {
        val hasil = edt_satu.text.toString().toInt() / edt_dua.text.toString().toInt()
        tv_result.text = hasil.toString()
    }

    private fun clear() {
        val nilai1 = edt_satu.setText("")
        val nilai2 = edt_dua.setText("")

        return nilai1
    }

    private fun validate(): Boolean {
        val nilai1 = edt_satu.text.toString()
        val nilai2 =
            edt_dua.text.toString()
        return !(nilai1.isEmpty() || nilai2.isEmpty())
    }
}




