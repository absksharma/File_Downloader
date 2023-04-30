package com.ab.download.downloadmanager

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class AndroidDownloader(private val context: Context) : Downloader {

    private val downloadManager = context.getSystemService(DownloadManager::class.java)

    override fun downloadFile(url: String): Long {
        val request = DownloadManager.Request(url.toUri())
            .setMimeType("image/jpeg")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE or DownloadManager.Request.NETWORK_WIFI)
            .setAllowedOverRoaming(false)
            .setDescription("Downloading...")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle("Image Downloading")
            /** Add Token if Request Header requires Auth-Token **/
//            .addRequestHeader("Authorization", "Bearer <token>") //
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "abhishek.jpg")

        return downloadManager.enqueue(request)
    }
}