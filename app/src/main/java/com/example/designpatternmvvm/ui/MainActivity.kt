package com.example.designpatternmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.designpatternmvvm.databinding.ActivityMainBinding
import com.example.designpatternmvvm.ui.viewmodel.CalcAgeViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val calcAgeViewModel: CalcAgeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculateAge.setOnClickListener {

            val name = binding.editTextName.text.trim().toString()
            val age = binding.editTextAge.text.trim().toString()
            calcAgeViewModel.CalcAge(name, age).observe(this, Observer {Person ->
                binding.textViewYourAge.text = "${Person.name} yuor age: ${Person.age}"

            })

        }
    }
}