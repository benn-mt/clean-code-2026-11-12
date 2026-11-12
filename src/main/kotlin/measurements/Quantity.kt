package org.madetech.measurements

class Quantity(val amount: Double, val unit: MeasurementUnit) {
    override fun equals(other: Any?): Boolean {
        if (other !is Quantity) return false
        
        return this.equals(other)
    }
    
    fun equals(other: Quantity): Boolean {
        return this.amount * this.unit.ratioToBaseUnit == other.amount * other.unit.ratioToBaseUnit
    }
}