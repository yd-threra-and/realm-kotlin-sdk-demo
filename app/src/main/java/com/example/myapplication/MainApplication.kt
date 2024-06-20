package com.example.myapplication

import android.app.Application

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize Kotlin Realm
        KotlinRealmInitialization.initialize()
    }
}