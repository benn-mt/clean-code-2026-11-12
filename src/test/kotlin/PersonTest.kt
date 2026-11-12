package org.madetech

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PersonTest {
    @Test
    fun shouldGreetPersonByName() {
        assertEquals(Person("Kotlin").greet(), "Hello, Kotlin!")
        assertEquals(Person("Ben").greet(), "Hello, Ben!")
    }
}