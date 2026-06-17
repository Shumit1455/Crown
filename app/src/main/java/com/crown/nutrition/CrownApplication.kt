package com.crown.nutrition

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CrownApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
