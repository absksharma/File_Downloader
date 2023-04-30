package com.ab.download.downloadmanager

interface Downloader {
    fun downloadFile(url: String): Long
}