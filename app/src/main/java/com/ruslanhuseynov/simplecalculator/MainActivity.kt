package com.ruslanhuseynov.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ruslanhuseynov.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun faiz(view: View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){

            val result = number1 * number2 / 100
            binding.resultText.text = result.toString()

        } else {

            Toast.makeText(this@MainActivity,"Enter Numbers",Toast.LENGTH_LONG).show()
        }
    }
    fun bolme(view: View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){

            val result = number1 / number2
            binding.resultText.text = result.toString()

        } else {

            Toast.makeText(this@MainActivity,"Enter Numbers",Toast.LENGTH_LONG).show()
        }
    }
    fun vurma(view: View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){

            val result = number1 * number2
            binding.resultText.text = result.toString()

        } else {

            Toast.makeText(this@MainActivity,"Enter Numbers",Toast.LENGTH_LONG).show()
        }
    }
    fun toplama(view: View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){

            val result = number1 + number2
            binding.resultText.text = result.toString()

        } else {

            Toast.makeText(this@MainActivity,"Enter Numbers",Toast.LENGTH_LONG).show()
        }
    }
    fun cixma(view: View){

        val number1 = binding.number1Text.text.toString().toDoubleOrNull()
        val number2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (number1 != null && number2 != null){

            val result = number1 - number2
            binding.resultText.text = result.toString()

        } else {

            Toast.makeText(this@MainActivity,"Enter Numbers",Toast.LENGTH_LONG).show()
        }
    }
    fun clear(view: View){

        binding.number1Text.setText("")
        binding.number2Text.setText("")
        binding.resultText.text = "0"

    }
}