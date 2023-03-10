package com.kooapps.stackybirdandroidr.isuwosd.suaijx

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

class Iowpwpsook(private val fplpcxlplpvplxckodok: Bcpcxplpkovokdo) {
    suspend fun kkvocovijijif() = fplpcxlplpvplxckodok.fplplpclplvkoxkocvkod()
}
interface Rwowpls {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun flpcxlpvlpxcp(): Response<Loosisjixjiuhcz>
}

@Keep
data class Loosisjixjiuhcz(
    @SerializedName("countryCode")
    val vocovkbko: String,
)

class Bcoxcokvo(private val fclplvp: Rwowpls) {
    suspend fun dpelps() = fclplvp.flpcxlpvlpxcp()
}

interface Bcpcxplpkovokdo {
    @GET("sw_burst.json")
    suspend fun fplplpclplvkoxkocvkod(): Response<Yowowowkosokd>
}

@Keep
data class Yowowowkosokd(
    @SerializedName("sw_burst_gqooqwisytyhgh")
    val fgplplvp: String,
    @SerializedName("sw_burst_vocpcjjjxx")
    val plpdkokokocxvijxcjijidv: String,
    @SerializedName("sw_burst_aqykspol")
    val dpllpdlpfpl: String,
)