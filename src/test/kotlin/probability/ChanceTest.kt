package org.madetech.probability

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ChanceTest {
    private val IMPOSSIBLE: Chance = Chance(0.0)
    private val FIFTY_FIFTY: Chance = Chance(0.5)
    private val CERTAIN: Chance = Chance(1.0)
    
    @Test
    fun shouldBeEqualWhenValuesEqual() {
        assertTrue(FIFTY_FIFTY == FIFTY_FIFTY)
        assertTrue(Chance(0.4).equals(Chance(0.4)))
        assertEquals(Chance(0.6), Chance(0.6))
    }
    
    @Test
    fun shouldNotBeEqualtoNull() {
        assertFalse(FIFTY_FIFTY == null)
        assertFalse(null == FIFTY_FIFTY)
    }
    
    @Test
    fun shouldNotBeEqualToOtherObject() {
        assertFalse(FIFTY_FIFTY == Object())
        assertFalse(Object() == FIFTY_FIFTY)
    }
    
    @Test
    fun shouldNotBeEqualWhenValuesAreDifferent(){
        assertNotEquals(FIFTY_FIFTY, Chance(0.4))
        assertNotEquals(IMPOSSIBLE, CERTAIN)
        assertNotEquals(CERTAIN, IMPOSSIBLE)
    }
    
    @Test
    fun shouldBeAbleToGetInverseProbability(){
        assertEquals(FIFTY_FIFTY, FIFTY_FIFTY.not())
        assertEquals(IMPOSSIBLE, CERTAIN.not())
        assertEquals(CERTAIN, IMPOSSIBLE.not())
        assertEquals(Chance(0.3), Chance(0.7).not())
        assertEquals(Chance(0.7), Chance(0.7).not().not())
    }
    
    @Test
    fun shouldBeAbleToFindTheChanceOfTwoThingsHappening(){
        assertEquals(IMPOSSIBLE, IMPOSSIBLE.and(IMPOSSIBLE))
        assertEquals(CERTAIN, CERTAIN.and(CERTAIN))
        assertEquals(IMPOSSIBLE, CERTAIN.and(IMPOSSIBLE))
        assertEquals(IMPOSSIBLE, IMPOSSIBLE.and(CERTAIN))
        assertEquals(Chance(0.25), FIFTY_FIFTY.and(FIFTY_FIFTY))
    }
}

