package org.madetech.measurements

internal class Volumes {
    companion object {
        val Teaspoon = MeasurementUnit(1)
        val Tablespoon = MeasurementUnit(3*1)
        val Ounce = MeasurementUnit(ratioToBaseUnit=2*3*1)
        val Cup = MeasurementUnit(ratioToBaseUnit=8*2*3*1)
        val Pint = MeasurementUnit(ratioToBaseUnit=2*8*2*3*1)
        val Quart = MeasurementUnit(ratioToBaseUnit=2*2*8*2*3*1)
        val Gallon = MeasurementUnit(ratioToBaseUnit=4*2*2*8*2*3*1)
    }
}