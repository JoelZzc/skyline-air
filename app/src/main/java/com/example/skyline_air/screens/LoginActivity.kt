package com.example.skyline_air.screens

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.skyline_air.R
import com.example.skyline_air.components.CustomButton
import com.example.skyline_air.components.CustomInput
import android.content.Intent
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById<CustomInput>(R.id.inputEmail)
        val password = findViewById<CustomInput>(R.id.inputPassword)
        val btnLogin = findViewById<CustomButton>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val emailText = email.text.toString()
            val passwordText = password.text.toString()

            if (emailText.isEmpty() || passwordText.isEmpty()) {
                Toast.makeText(this, "Completa los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Bienvenido ✈️", Toast.LENGTH_SHORT).show()
            }
        }

        val txtSignup = findViewById<TextView>(R.id.txtSignup)

        txtSignup.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}