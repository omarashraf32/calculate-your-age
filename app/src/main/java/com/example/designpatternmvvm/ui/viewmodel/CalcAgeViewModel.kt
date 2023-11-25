package com.example.designpatternmvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.designpatternmvvm.model.Person
import com.example.designpatternmvvm.repository.CalcAgeRepository
import com.example.designpatternmvvm.repository.CalcAgeRepositoryImpl
import java.util.Calendar

class CalcAgeViewModel: ViewModel() {

    val calcAgeRepo: CalcAgeRepository = CalcAgeRepositoryImpl()

    fun CalcAge(name: String, age: String): MutableLiveData<Person>{
        var personMutablLiveData = calcAgeRepo.calcYourAge(name, age)
        return personMutablLiveData

    }
}