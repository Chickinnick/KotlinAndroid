package com.chickinnick.androidkotlin.di

import com.chickinnick.androidkotlin.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: App) {
    @Provides
    @Singleton
    fun provideApp() = app
}