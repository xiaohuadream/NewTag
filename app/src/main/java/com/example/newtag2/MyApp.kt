package com.example.newtag2

import android.app.Application
import com.xyz.informercial.base.BusiAd

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        BusiAd.init(this, "1759865533401464833")
    }
}