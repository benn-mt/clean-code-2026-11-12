package org.madetech.measurements

internal class Lengths {
    companion object {
        val Inch = MeasurementUnit(1)
        val Foot = MeasurementUnit(Inch, 12*1)
        val Yard = MeasurementUnit(Inch, ratioToBaseUnit=3*12*1)
        val Furlong = MeasurementUnit(Inch, ratioToBaseUnit=220*3*12*1)
        val Mile = MeasurementUnit(Inch, ratioToBaseUnit=8*220*3*12*1)
    }
}