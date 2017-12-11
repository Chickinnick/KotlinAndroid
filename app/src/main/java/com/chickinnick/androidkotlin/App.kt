package com.chickinnick.androidkotlin

import android.app.Application
import com.chickinnick.androidkotlin.di.AppComponent
import com.chickinnick.androidkotlin.di.AppModule
import com.chickinnick.androidkotlin.di.DaggerAppComponent

class App : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
