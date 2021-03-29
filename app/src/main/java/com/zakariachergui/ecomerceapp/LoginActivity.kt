package com.zakariachergui.ecomerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun goTohome(view: View){
       startActivity(Intent(this.applicationContext,MainActivity::class.java))
    }
    fun goToSignup(view: View){
        startActivity(Intent(this.applicationContext,SignUpActivity::class.java))
    }
}