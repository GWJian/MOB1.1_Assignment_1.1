package com.example.assignment_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sign

class Signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val signupBtn = findViewById<Button>(R.id.signup_button)
        val name = findViewById<TextView>(R.id.username_signUp_editText)
        val email =findViewById<TextView>(R.id.email_signUp_editText)
        val password = findViewById<TextView>(R.id.password_signUp_editText)

        //if name email and password is empty toast "Please fill all the fields" else go to signup_page2

        signupBtn.setOnClickListener{
            val name = name.text.toString()
            val email = email.text.toString()
            val password = password.text.toString()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Please fill all the fields",Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, Signup_page2::class.java)
                val message = "$name, We are really sorry. The feature is not implemented yet."
                intent.putExtra("MGS_TO_USER", message)
                startActivity(intent)
            }

        }


    }
}
