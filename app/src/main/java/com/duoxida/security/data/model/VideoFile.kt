package com.duoxida.security.data.model

data class VideoFile(
    val userName: String,
    val fileName: String,
    val filePath: String,
    val thumbnail: String,
    val fileLength: Long,
    val key: String
)