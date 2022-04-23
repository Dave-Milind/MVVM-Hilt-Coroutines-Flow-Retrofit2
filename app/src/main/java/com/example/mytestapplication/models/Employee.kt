package com.example.mytestapplication.models

import android.util.Log
import javax.inject.Inject


class Employee{

    @Inject
    constructor()

    fun takeSalary():String{

        Log.e("xoxo","Salary mil rhi hai")

        return "Salary mil rhi hai"
    }

}
