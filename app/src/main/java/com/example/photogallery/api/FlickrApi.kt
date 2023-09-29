package com.example.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "b10173c58a32a89ca7f55039e6dec2e9"
private const val SECRET = "51128f770724a00a"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList"+
            "&api_key=$API_KEY" +
            "&format=json" +
            "&nojsoncallback=1" +
            "&extras=url_s"
    )
    suspend fun fetchPhotos() : FlickrResponse
}