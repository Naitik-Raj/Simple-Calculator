package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener{
            binding.inputText.text = ""
            binding.outputText.text = ""
        }
        binding.btn0.setOnClickListener{
            binding.inputText.append("0")
        }
        binding.btn1.setOnClickListener{
            binding.inputText.append("1")
        }
        binding.btn2.setOnClickListener{
            binding.inputText.append("2")
        }
        binding.btn3.setOnClickListener{
            binding.inputText.append("3")
        }
        binding.btn4.setOnClickListener{
            binding.inputText.append("4")
        }
        binding.btn5.setOnClickListener{
            binding.inputText.append("5")
        }
        binding.btn6.setOnClickListener{
            binding.inputText.append("6")
        }
        binding.btn7.setOnClickListener{
            binding.inputText.append("7")
        }
        binding.btn8.setOnClickListener{
            binding.inputText.append("8")
        }
        binding.btn9.setOnClickListener{
            binding.inputText.append("9")
        }
        binding.btnMultiply.setOnClickListener{
            binding.inputText.append(" * ")
        }
        binding.btnSubtraction.setOnClickListener{
            binding.inputText.append(" - ")
        }
        binding.btnDot.setOnClickListener{
            binding.inputText.append(".")
        }
        binding.btnDivide.setOnClickListener{
            binding.inputText.append(" / ")
        }
        binding.btnStartBracket.setOnClickListener{
            binding.inputText.append(" ( ")
        }
        binding.btnEndBracket.setOnClickListener{
            binding.inputText.append(" ) ")
        }
        binding.btnAddition.setOnClickListener{
            binding.inputText.append(" + ")
        }
        binding.btnEqual.setOnClickListener{
            val expression = ExpressionBuilder(binding.inputText.text.toString()).build()
            val result = expression.evaluate()

            val longRes = result.toLong()
            if (result == longRes.toDouble()){
                binding.outputText.text = longRes.toString()
            }
            else{
                binding.outputText.text = result.toString()
            }
        }
    }
}