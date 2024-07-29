package com.andyb.notesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Buat daftar Person
        val people = listOf(
            Student("Mohamad Y.", 20, "mohamad.y@gmail.com"),
            Student("Andy Warhol", 22, "andy_w@hotmail.com"),
            Student("Baharuddin J.", 21, "baharuddin_j@yahoo.com")
        )

        // Gabungkan informasi setiap Person menjadi satu string
        val info = StringBuilder()
        for (person in people) {
            info.append("Nama: ").append(person.name).append("\n")
                .append("Umur: ").append(person.age).append("\n")
                .append("Email: ").append(person.email).append("\n\n")
        }

        // Tampilkan informasi di TextView
        val infoTextView: TextView = findViewById(R.id.info_text_view)
        infoTextView.text = info.toString()
    }
}
