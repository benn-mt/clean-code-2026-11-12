package org.madetech.measurements

internal class Volumes {
    companion object {
        val Teaspoon = MeasurementUnit(1)
        val Tablespoon = MeasurementUnit(Teaspoon, 3*1)
        val Ounce = MeasurementUnit(Teaspoon, ratioToBaseUnit=2*3*1)
        val Cup = MeasurementUnit(Teaspoon, ratioToBaseUnit=8*2*3*1)
        val Pint = MeasurementUnit(Teaspoon, ratioToBaseUnit=2*8*2*3*1)
        val Quart = MeasurementUnit(Teaspoon, ratioToBaseUnit=2*2*8*2*3*1)
        val Gallon = MeasurementUnit(Teaspoon, ratioToBaseUnit=4*2*2*8*2*3*1)
    }
}