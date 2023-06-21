package com.example.assignment_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        val signupBtn =findViewById<Button>(R.id.signup_button)

        signupBtn.setOnClickListener {
            val intent = Intent(this, Signup_page2::class.java)
            val name =findViewById<TextView>(R.id.username_signUp_editText)
            val Name = name.text.toString()
            val message = "$Name, We are really sorry. The feature is not implemented yet."
            intent.putExtra("MGS_TO_USER", message)
            startActivity(intent)
        }
    }
}