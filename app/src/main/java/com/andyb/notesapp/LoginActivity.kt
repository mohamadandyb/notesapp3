package com.andyb.notesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var loginImageView: ImageView
    private lateinit var loginTextView: TextView

    private lateinit var admin: Admin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.login)
        loginImageView = findViewById(R.id.login_image)
        loginTextView = findViewById(R.id.login_text)

        // Set gambar dan teks secara dinamis jika diperlukan
        loginImageView.setImageResource(R.drawable.logo_unsia)
        loginTextView.text = "Log in"

        // Inisialisasi admin dengan username dan password yang sudah ditentukan
        admin = Admin("admin", "admin123")

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (admin.validate(username, password)) {
                // Login berhasil
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Login gagal
                Toast.makeText(this@LoginActivity, "Username atau password tidak valid!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}