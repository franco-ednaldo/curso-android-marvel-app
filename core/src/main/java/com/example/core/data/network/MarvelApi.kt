package com.example.core.data.network

import com.example.core.data.network.response.DataWrapperResponse
import jdk.nashorn.internal.objects.annotations.Getter
import retrofit2.Call
import retrofit2.http.QueryMap

interface MarvelApi {
    @Getter(name = "characters")
    suspend fun getCharacters(@QueryMap queries: Map<String, String>): Call<DataWrapperResponse>
}