package com.example.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnRegister.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
            // overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

    }
}