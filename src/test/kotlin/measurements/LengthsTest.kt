package org.madetech.measurements

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LengthsTest {    
    @Test
    fun testTheChart() {
        assertEquals(Quantity(12.0, Lengths.Inch), Quantity(1.0, Lengths.Foot))
        assertEquals(Quantity(3.0, Lengths.Foot), Quantity(1.0, Lengths.Yard))
        assertEquals(Quantity(220.0, Lengths.Yard), Quantity(1.0, Lengths.Furlong))
        assertEquals(Quantity(8.0, Lengths.Furlong), Quantity(1.0, Lengths.Mile))
    }
}