package com.joba.barebone.app.di

import com.google.gson.Gson
import com.joba.barebone.app.AndroidApplication
import dagger.Component
import javax.inject.Singleton

/**
 * Dagger component for application.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun getGson(): Gson

    fun inject(app: AndroidApplication)

    companion object {
        fun init(): AppComponent {
            return DaggerAppComponent.builder()
                    .appModule(AppModule())
                    .build()
        }
    }
}