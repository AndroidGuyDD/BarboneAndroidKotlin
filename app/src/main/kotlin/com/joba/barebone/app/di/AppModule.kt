package com.joba.barebone.app.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import javax.inject.Singleton

/**
 * Dagger application wide module providing singletons.
 */
@Module
class AppModule {

    @Provides
    @Singleton
    fun provideGSON(): Gson {
        return GsonBuilder().setPrettyPrinting().create()
    }

    @Provides
    @Singleton
    fun provideOKhhtp(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    @Provides
    @Singleton
    fun provideAndroidUiScheduler(): Scheduler{
        return AndroidSchedulers.mainThread()
    }
}