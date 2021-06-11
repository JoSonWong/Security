package com.duoxida.security.data

import com.duoxida.security.data.model.VideoFile

class VideoFileDataSource {

    fun load(userName: String): Result<MutableList<VideoFile>> {
        var list = mutableListOf<VideoFile>()
        list.add(VideoFile("1", "2", "3", "4", 255252, "5"))
        return Result.Success(list)
    }

}