package com.dagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
         val emailService = component.getEmailService()
        userRegistrationService.registerUser("dipak@gmail.com","123")
        emailService.send("123","456","abc")

    }
}