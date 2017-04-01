package com.joba.barebone.app

import android.app.Application
import com.joba.barebone.app.di.AppComponent

/**
 * This apps application class.
 */
class AndroidApplication : Application() {

    var appComponent: AppComponent
        private set

    init {
        instance = this
        appComponent = AppComponent.init().apply { inject(this@AndroidApplication) }
    }

    companion object {
        lateinit var instance: AndroidApplication
    }
}