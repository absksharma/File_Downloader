package com.ab.download

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ab.download.downloadmanager.AndroidDownloader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val downloader = AndroidDownloader(this)
        downloader.downloadFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkAFLc8Dx-PEaMHbiF5ODRFg3PPUJQwqT05sGnDa2Q3RMaIyP7l-tibZg6X-RUORi3Wec&usqp=CAU")
    }
}