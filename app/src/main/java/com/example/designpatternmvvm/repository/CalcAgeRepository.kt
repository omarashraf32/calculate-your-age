package com.example.designpatternmvvm.repository

import androidx.lifecycle.MutableLiveData
import com.example.designpatternmvvm.model.Person

interface CalcAgeRepository  {

    fun calcYourAge( name: String, age: String): MutableLiveData<Person>
}