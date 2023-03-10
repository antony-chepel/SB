package com.kooapps.stackybirdandroidr.isuwosd.suaijx

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kooapps.stackybirdandroidr.isuwosd.Fdooxkkocjis
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val cxucxicxkokodofk = module {

    single  <Bcpcxplpkovokdo> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Bcpcxplpkovokdo::class.java)
    }

    single <Rwowpls> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Rwowpls::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://immortalriches.live/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Bcoxcokvo(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Iowpwpsook(get(named("HostInter")))
    }
    single{
        gcxpclpxvlpxcvp()
    }
    single (named("SharedPreferences")) {
        jcxkxivjixijdijjf(androidApplication())
    }
}

fun jcxkxivjixijdijjf(eplwlpw: Application): SharedPreferences {
    return eplwlpw.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun gcxpclpxvlpxcvp(): Gson {
    return GsonBuilder().create()
}

val bcxjivjijidjifjidji = module {
    viewModel (named("MainModel")){
        Eowkisjdsad((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Fdooxkkocjis(get())
    }
}