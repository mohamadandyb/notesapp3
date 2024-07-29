package com.andyb.notesapp

abstract class Person(
    var name: String,
    var age: Int
) {
    abstract fun displayInfo()
}
