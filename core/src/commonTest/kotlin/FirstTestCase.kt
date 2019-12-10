package com.imartinez.core

import kotlin.test.Test
import kotlin.test.assertEquals

class FirstTestCase {

    @Test
    fun `Test that assert true works`() {
        assertEquals(createApplicationScreenMessage(), "Kotlin Rocks!")
    }

}