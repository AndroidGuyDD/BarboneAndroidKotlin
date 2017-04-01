package com.joba.barebone.example.di

import android.app.Activity
import com.joba.barebone.app.AndroidApplication
import com.joba.barebone.app.annotations.PerActivity
import com.joba.barebone.app.di.ActivityComponent
import com.joba.barebone.app.di.ActivityModule
import com.joba.barebone.app.di.AppComponent
import com.joba.barebone.example.ui.MainActivity
import dagger.Component

/**
 * Dagger component for main activity.
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class, MainActivityModule::class))
interface MainActivityComponent: ActivityComponent {

    fun inject(mainActivity: MainActivity)

    companion object {
        fun init(activity: Activity): MainActivityComponent {
            return DaggerMainActivityComponent.builder()
                    .appComponent(AndroidApplication.instance.appComponent)
                    .activityModule(ActivityModule(activity))
                    .mainActivityModule(MainActivityModule())
                    .build()
        }
    }
}