package com.joba.barebone.example.presenter

import android.content.Context
import com.joba.barebone.common.contract.BasePresenterContract
import com.joba.barebone.example.contract.ExamplePresenterContract
import java.text.SimpleDateFormat
import java.util.*

/**
 * MVP presenter decoupling activity (android view components) from general presentation logic.
 */
class ExamplePresenter(val context: Context,
                       val viewContract: ExamplePresenterContract) : BasePresenterContract {

    private var dateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH)

    override fun resume() {
    }

    override fun pause() {
    }

    override fun destroy() {
    }

    fun doSomeStuff(string: String) {
        if (string.isNullOrEmpty()) {
            return
        }

        viewContract.showItem(string + "\nedited at ${dateFormat.format(Date())}")
    }

}