package com.andyb.notesapp

class Student(name: String, age: Int, var email: String) : Person(name, age) {

    override fun displayInfo() {
        println("Nama : $name")
        println("Umur : $age")
        println("Email: $email")
    }
}
