package com.gabrielcamargo.marvelwebservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gabrielcamargo.marvelwebservice.comic.view.ComicActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount_loginActivity)
        btnCreateAccount.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btnLogin = findViewById<Button>(R.id.btnLogIn_loginActivity)
        btnLogin.setOnClickListener{
            val intent = Intent(this, ComicActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}