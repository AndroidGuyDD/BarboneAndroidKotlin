package com.joba.barebone.example.presenter

import android.content.Context
import android.util.Log
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

    companion object {
        fun foo(){
            Log.d("joba", "Test")
        }
    }

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

        ExamplePresenterTest.foo()

        presenter.doSomeStuff("")
        verify(viewContract, never()).showItem(enhancedAny())


    }

}