package com.kooapps.stackybirdandroidr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.Eowkisjdsad
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val sisai by viewModel<Eowkisjdsad>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sisai.jkbkovok(this)
    }
}