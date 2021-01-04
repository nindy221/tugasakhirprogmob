package com.tugasakhirsemester.nindy.api

import com.tugasakhirsemester.nindy.model.IndonesiaResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("indonesia")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>
}