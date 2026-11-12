package org.madetech.measurements

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class QuantityTest {
    @Test
    fun QuantityWithSameUnitAndAmountAreEqual() {
        assertEquals(Quantity(1.0, Volumes.Teaspoon), Quantity(1.0, Volumes.Teaspoon))
        assertNotEquals(Quantity(1.0, Volumes.Teaspoon), Quantity(2.0, Volumes.Teaspoon))
        assertNotEquals(Quantity(1.0, Volumes.Teaspoon), Quantity(1.0, Volumes.Tablespoon))
    }
}