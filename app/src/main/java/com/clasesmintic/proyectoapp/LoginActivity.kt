package com.clasesmintic.proyectoapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    private var edtUsername: EditText?=null
    private var edtPassword: TextInputEditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtUsername = findViewById(R.id.edtUsername)
        edtPassword= findViewById(R.id.edtpassword)
    }

    fun onLogin2(view: View) {
        val messagepassword=getString(R.string.messagepassword)
        val messageusername=getString(R.string.messageusername)
        val welcome=getString(R.string.txt_welcome)
        var username:String=edtUsername!!.text.toString()
        if(username=="jjm@correo.com" ){
            if(edtPassword!!.text.toString()=="12345"){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,welcome,Toast.LENGTH_LONG).show()
            }
            else{
                val dialog=AlertDialog.Builder(this)
                    .setTitle("ERROR")
                    .setMessage(messagepassword)
                    .create()
                    .show()
            }
        }
        else{
            val dialog=AlertDialog.Builder(this)
                .setTitle("ERROR")
                .setMessage(messageusername)
                .create()
                .show()
        }
    }
}