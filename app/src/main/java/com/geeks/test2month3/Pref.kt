package com.geeks.test2month3

import android.content.Context

class Pref(context: Context) {

    val pref = context.getSharedPreferences("key", Context.MODE_PRIVATE)

    fun safeCount (counter: Int ){ pref.edit().putInt("counter" , counter) .apply()}

    fun getCount (): Int{return pref.getInt("counter", 0) }
}