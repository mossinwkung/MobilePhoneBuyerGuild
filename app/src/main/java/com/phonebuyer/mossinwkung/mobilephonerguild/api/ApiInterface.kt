package com.phonebuyer.mossinwkung.mobilephonerguild.api

import com.phonebuyer.mossinwkung.mobilephonerguild.response.MobileDetailImageListResponse
import com.phonebuyer.mossinwkung.mobilephonerguild.response.MobileListResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface APIInterface {

    @GET("/api/mobiles/")
    fun getMobileItem(
    ): Observable<ArrayList<MobileListResponse>>

    @GET("/api/mobiles/{mobile_id}/images/")
    fun getMobileItemImage(
            @Path("mobile_id") mobileId: String
    ): Observable<ArrayList<MobileDetailImageListResponse>>
}