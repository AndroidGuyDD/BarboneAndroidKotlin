package com.joba.barebone.app.di

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Base module for activities.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun provideActivity() = activity
}