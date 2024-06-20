package com.example.myapplication

import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

object KotlinRealmInitialization {

    fun initialize() {
        val config = RealmConfiguration.Builder(schema = setOf(SampleEntity::class)).build()
        val realm = Realm.open(config)
    }
}