package org.madetech.measurements

class MeasurementUnit(val baseUnit: MeasurementUnit?, val ratioToBaseUnit: Int) {
    constructor(ratioToBaseUnit: Int) : this(null, ratioToBaseUnit)
    
    fun amountInBaseUnit(amount: Double) : Double{
        return amount * this.ratioToBaseUnit
    }
}
