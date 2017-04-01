package com.joba.barebone.example.di

import android.app.Activity
import com.joba.barebone.app.annotations.PerActivity
import com.joba.barebone.example.contract.ExamplePresenterContract
import com.joba.barebone.example.ui.adapter.ResultsAdapter
import com.joba.barebone.example.presenter.ExamplePresenter
import dagger.Module
import dagger.Provides

/**
 * Module for the main activity.
 */
@Module
class MainActivityModule {

    @Provides
    @PerActivity
    fun provideMainPresenter(activity: Activity): ExamplePresenter {
        return ExamplePresenter(activity, activity as ExamplePresenterContract)
    }

    @Provides
    @PerActivity
    fun provideAdapter(activity: Activity): ResultsAdapter {
        return ResultsAdapter(activity)
    }

}