package org.madetech.measurements

enum class Volumes(val ratioToBaseUnit: Int) {
    Teaspoon(1),
    Tablespoon(3*1),
    Ounce(ratioToBaseUnit=2*3*1)
}