package com.example.designpatternmvvm.repository

import androidx.lifecycle.MutableLiveData
import com.example.designpatternmvvm.model.Person
import java.util.Calendar

class CalcAgeRepositoryImpl: CalcAgeRepository {


    override fun calcYourAge(name: String, age: String): MutableLiveData<Person> {
        val infoMutableLiveData = MutableLiveData<Person>()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - age.toInt()
        val person = Person(name, yourAge)
        infoMutableLiveData.postValue(person)
        return infoMutableLiveData
    }
}