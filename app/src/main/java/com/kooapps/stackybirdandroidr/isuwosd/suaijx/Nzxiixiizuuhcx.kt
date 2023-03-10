package com.kooapps.stackybirdandroidr.isuwosd.suaijx

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import com.kooapps.stackybirdandroidr.isuwosd.Uooqkoijadax
import com.kooapps.stackybirdandroidr.databinding.ActivityNzxiixiizuuhcxBinding

class Nzxiixiizuuhcx : AppCompatActivity() {
    private lateinit var oxckovokx : SharedPreferences
    private lateinit var dplel : SharedPreferences
    private lateinit var dsopfkookcoxkvko : ActivityNzxiixiizuuhcxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oxckovokx = getSharedPreferences("SW_BRS_BNS", MODE_PRIVATE)
        dplel = getSharedPreferences("SCRS_MAIN_SW", MODE_PRIVATE)
        dsopfkookcoxkvko = ActivityNzxiixiizuuhcxBinding.inflate(layoutInflater)
        setContentView(dsopfkookcoxkvko.root)
        izxokczokokjizicjs()
        dplsdlpplx()
    }


    private fun dplsdlpplx() = with(dsopfkookcoxkvko){
       val sdkow = oxckovokx.getInt("SW_BRS_BNS",2)
       val vokckogokf = oxckovokx.getInt("SCRS_MAIN_SW",50)

        val dplpw = sdkow * vokckogokf
        flpcxpvlpxcplxclp.text = "Sweet scores : $dplpw"

    }


    @SuppressLint("ClickableViewAccessibility")
    private fun izxokczokokjizicjs() = with(dsopfkookcoxkvko){
        lcxovkcxoijbjiv.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                        Handler().postDelayed({
                            startActivity(Intent(this@Nzxiixiizuuhcx, Uooqkoijadax::class.java))
                        },1000)

                    v?.animate()?.scaleX(0.80f)?.scaleY(0.80f)?.setDuration(0)
                } else if(event?.action == MotionEvent.ACTION_UP){
                    v?.animate()?.scaleX(1.0f)?.scaleY(1.0f)?.setDuration(0)
                }

                return true
            }

        })
    }
}