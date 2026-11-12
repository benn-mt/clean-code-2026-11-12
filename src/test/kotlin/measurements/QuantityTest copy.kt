package org.madetech.measurements

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class VolumnesTest {    
    @Test
    fun testTheChart() {
        assertEquals(Quantity(1.0, Volumes.Tablespoon), Quantity(3.0, Volumes.Teaspoon))
        assertEquals(Quantity(1.0, Volumes.Ounce), Quantity(2.0, Volumes.Tablespoon))
    }
}