package com.joba.barebone.common

import com.joba.barebone.BuildConfig
import org.junit.Ignore
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@Ignore("BaseClass")
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
open class BaseTest {

    fun <T> enhancedAny(): T {
        org.mockito.Mockito.any<T>()
        return null as T
    }
}