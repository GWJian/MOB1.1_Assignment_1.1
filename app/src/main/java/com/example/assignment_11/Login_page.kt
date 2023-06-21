package com.example.assignment_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


//===================== Login Button Start=====================
        val loginBtn = findViewById<Button>(R.id.login_button)
        val username = findViewById<EditText>(R.id.username_editText)
        val password = findViewById<EditText>(R.id.password_editText)

        loginBtn.setOnClickListener {
            val username = username.text.toString()
            val password = password.text.toString()

            if (username == "username" && password == "password") {
                val intent = Intent(this, Login_page2::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "OOPS!, wrong username or password",Toast.LENGTH_LONG).show()
            }
        }

//===================== Login Button End=====================

//===================== Register Button Start=====================
        val registerBtn = findViewById<Button>(R.id.register_button)

        registerBtn.setOnClickListener {
            val intent = Intent(this, Signup_page::class.java)
            startActivity(intent)
        }
//===================== Register Button End=====================
    }
}