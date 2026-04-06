package com.example.skyline_air.screens

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.skyline_air.R
import com.example.skyline_air.components.CustomButton
import com.example.skyline_air.components.CustomInput

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val name = findViewById<CustomInput>(R.id.inputName)
        val email = findViewById<CustomInput>(R.id.inputEmail)
        val password = findViewById<CustomInput>(R.id.inputPassword)
        val confirmPassword = findViewById<CustomInput>(R.id.inputConfirmPassword)
        val btnSignup = findViewById<CustomButton>(R.id.btnSignup)

        btnSignup.setOnClickListener {
            if (
                name.text.isEmpty() ||
                email.text.isEmpty() ||
                password.text.isEmpty() ||
                confirmPassword.text.isEmpty()
            ) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cuenta creada ✈️", Toast.LENGTH_SHORT).show()
            }
        }
    }
}