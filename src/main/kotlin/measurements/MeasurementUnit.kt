package org.madetech.measurements

class MeasurementUnit(var baseUnit: MeasurementUnit?, val ratioToBaseUnit: Int) {
    constructor(ratioToBaseUnit: Int) : this(null, ratioToBaseUnit)
    
    init {
        if (this.baseUnit == null) this.baseUnit = this
    }
    
    fun amountInBaseUnit(amount: Double) : Double{
        return amount * this.ratioToBaseUnit
    }
    
    fun compatibleWith(other: MeasurementUnit) : Boolean{
        return this.baseUnit == other.baseUnit
    }
}
