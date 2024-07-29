package com.andyb.notesapp

class Admin(username: String, password: String) : User(username, password) {
    override fun validate(username: String, password: String): Boolean {
        return this.username == username && this.password == password
    }
}
