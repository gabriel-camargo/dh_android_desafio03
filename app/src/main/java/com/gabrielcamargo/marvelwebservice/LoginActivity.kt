package com.gabrielcamargo.marvelwebservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount_loginActivity)
        btnCreateAccount.setOnClickListener{
            val intent = Intent(this, SignUpAcitivty::class.java)
            startActivity(intent)
            finish()
        }
    }
}