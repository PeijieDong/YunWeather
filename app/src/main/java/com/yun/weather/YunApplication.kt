package com.yun.weather

import android.app.Application
import android.content.Context

class YunApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object{
        lateinit var context: Context
        const val key = "G0QTbwffRranVIJ6"
    }
}