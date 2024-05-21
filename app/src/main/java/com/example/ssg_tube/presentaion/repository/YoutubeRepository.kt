package com.example.ssg_tube.presentaion.repository

import com.example.ssg_tube.presentaion.model.ChannelInfo
import com.example.ssg_tube.presentaion.model.VideoModel

interface YoutubeRepository {
    suspend fun getPopularVideos(): List<VideoModel>
    suspend fun getCategoryVideos(categoryId: String): List<VideoModel>
    suspend fun getChannel(channelId: List<String>): List<ChannelInfo>
    suspend fun getSearch(query: String, order: String): List<VideoModel>
}