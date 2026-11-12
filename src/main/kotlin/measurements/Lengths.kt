package org.madetech.measurements

class Lengths() {
    companion object {
        val Inch = MeasurementUnit(1)
        val Foot = MeasurementUnit(12*1)
        val Yard = MeasurementUnit(ratioToBaseUnit=3*12*1)
        val Furlong = MeasurementUnit(ratioToBaseUnit=220*3*12*1)
        val Mile = MeasurementUnit(ratioToBaseUnit=8*220*3*12*1)
    }
}