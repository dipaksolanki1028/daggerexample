package com.dagerexample

import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              private val emailService: EmailService
){

    fun registerUser(email:String,password:String){
    Log.e("test","User Register")

    }
}