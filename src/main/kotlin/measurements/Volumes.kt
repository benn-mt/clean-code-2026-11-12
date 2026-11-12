package org.madetech.measurements

enum class Volumes(val ratioToBaseUnit: Int) {
    Teaspoon(1),
    Tablespoon(3*1),
    Ounce(ratioToBaseUnit=2*3*1),
    Cup(ratioToBaseUnit=8*2*3*1),
    Pint(ratioToBaseUnit=2*8*2*3*1),
    Quart(ratioToBaseUnit=2*2*8*2*3*1),
    Gallon(ratioToBaseUnit=4*2*2*8*2*3*1),
}