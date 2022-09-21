package com.example.androidunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password true`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Phillip",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `valid username and password not correctly repeated returns false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Phillip",
            "123",
            "1"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Peter",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Peter",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `invalid password format returns false`() {
        val result = RegistrationUtil.validationRegistrationInput(
            "Phillip",
            "1",
            "1"
        )

        assertThat(result).isFalse()
    }
}