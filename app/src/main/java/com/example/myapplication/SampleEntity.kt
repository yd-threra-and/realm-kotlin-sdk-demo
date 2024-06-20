package com.example.myapplication

import io.realm.kotlin.types.RealmObject

open class SampleEntity : RealmObject {
    var id: Int = 0
    var message: String = ""
}