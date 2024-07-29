package com.andyb.notesapp

abstract class User(
    protected val username: String,
    protected val password: String
) {
    abstract fun validate(username: String, password: String): Boolean
}
