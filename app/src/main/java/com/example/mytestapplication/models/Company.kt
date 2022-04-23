package com.example.mytestapplication.models

import javax.inject.Inject

class Company @Inject constructor(val emp:Employee) {


    fun getEmployeeUpdate():String{

        return emp.takeSalary()

    }


}