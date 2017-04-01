package com.joba.barebone.example.presenter

import android.content.Context
import com.joba.barebone.common.BaseTest
import com.joba.barebone.example.contract.ExamplePresenterContract
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations.initMocks

/**
 * Example Test.
 */
class ExamplePresenterTest: BaseTest() {

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var viewContract: ExamplePresenterContract

    @Before
    fun setup() {
        initMocks(this)
    }

    @Test
    fun doSomeStuff() {
        val presenter = ExamplePresenter(context, viewContract)

        presenter.doSomeStuff("")
        verify(viewContract, never()).showItem(enhancedAny())
    }

}