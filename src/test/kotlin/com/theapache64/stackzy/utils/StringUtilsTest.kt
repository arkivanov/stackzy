package com.theapache64.stackzy.utils

import com.theapache64.expekt.should
import com.theapache64.stackzy.util.StringUtils
import org.junit.Test


class StringUtilsTest {
    @Test
    fun `Remove apostrophe from start and end`() {
        StringUtils
            .removeApostrophe("\"McDonald's\"")
            .should.equal("McDonald's")
    }

    @Test
    fun `Do not remove start and end`() {
        StringUtils
            .removeApostrophe("McDonald's")
            .should.equal("McDonald's")
    }

    @Test
    fun `Do nothing`() {
        StringUtils
            .removeApostrophe("McDonalds")
            .should.equal("McDonalds")
    }

    @Test
    fun `Remove apostrophe from start and end - complex`() {
        StringUtils
            .removeApostrophe("\"\"M\"c'Do'na\"ld's\"\"")
            .should.equal("\"M\"c'Do'na\"ld's\"")
    }
}