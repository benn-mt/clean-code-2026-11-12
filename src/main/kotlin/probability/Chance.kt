package org.madetech.probability

import kotlin.math.abs

const val CERTAIN_LIKELIHOOD = 1.0
const val THRESHOLD = 0.00001

class Chance(val likelihood: Double) {
    override fun equals(other: Any?): Boolean {
        if (other !is Chance) return false
        
        return this.equals(other)
    }
    
    fun equals(other: Chance): Boolean {
        //println("this.likelihood: ${this.likelihood}, other: ${other.likelihood}")
        return abs(this.likelihood - other.likelihood) < THRESHOLD
    }
    
    fun not(): Chance{
        return Chance(CERTAIN_LIKELIHOOD - this.likelihood)
    }
    
    fun and(other: Chance): Chance{
        return Chance(this.likelihood * other.likelihood)
    }
}


