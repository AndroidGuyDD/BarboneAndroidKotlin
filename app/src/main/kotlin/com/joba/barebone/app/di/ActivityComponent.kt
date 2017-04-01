package com.joba.barebone.app.di

import android.app.Activity
import com.joba.barebone.app.AndroidApplication
import com.joba.barebone.app.annotations.PerActivity
import dagger.Component

/**
 * Base Dagger component for all android activities.
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun getActivity(): Activity

    companion object {
        fun init(activity: Activity): ActivityComponent {
            return DaggerActivityComponent.builder()
                    .appComponent(AndroidApplication.instance.appComponent)
                    .activityModule(ActivityModule(activity))
                    .build()
        }
    }
}