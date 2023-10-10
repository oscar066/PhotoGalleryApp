package com.example.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "b10173c58a32a89ca7f55039e6dec2e9"
private const val SECRET = "51128f770724a00a"

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos() : FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String) : FlickrResponse
}