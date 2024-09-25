package com.dagerexample

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(to:String,from:String,body:String?)
    {
        Log.e("test","email save")
    }
}