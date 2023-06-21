    package com.example.assignment_11

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.TextView
    import org.w3c.dom.Text

    class Signup_page2 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_signup_page2)

            val message = intent.getStringExtra("MGS_TO_USER")?: "The message is null"
            val textView =findViewById<TextView>(R.id.signup_page2_textView)
            textView.text = message
        }
    }