package com.example.androidunittesting

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /*
    * the input is not valid if...
    * the username/password is empty
    * the username is already taken
    * confirmed pw not the same as pw
    * pw contains contains 2 characters
     */

    fun validationRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ) : Boolean {

        return !(username.isEmpty() || password.isEmpty())
                && username !in existingUsers
                && password == confirmedPassword
                && password.count { it.isDigit() } >= 2

    }
}