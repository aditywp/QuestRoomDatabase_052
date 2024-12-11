package com.example.roomlocaldb

import android.app.Application
import com.example.roomlocaldb.dependeciesinjection.ContainerApp

class KrsApp: Application() {
    lateinit var containerApp: ContainerApp // Fungsinya untuk menyimpan instace dari ContainerApp
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) // Membuat instance dari ContainerApp
        // instance adalah object yang dibuat dari class
    }
}