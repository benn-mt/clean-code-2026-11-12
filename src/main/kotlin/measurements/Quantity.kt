package org.madetech.measurements

class Quantity(val amount: Double, val unit: MeasurementUnit) {
    override fun equals(other: Any?): Boolean {
        if (other !is Quantity) return false
        
        return this.equals(other)
    }
    
    fun equals(other: Quantity): Boolean {
        return this.unit.compatibleWith(other.unit) && this.amountInBaseUnit() == other.amountInBaseUnit()
    }
    
    private fun amountInBaseUnit() : Double{
        return this.unit.amountInBaseUnit(this.amount)
    }
}