package com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.kooapps.stackybirdandroidr.R
import com.kooapps.stackybirdandroidr.databinding.ActivityHgctxvyygdBinding
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.Nzxiixiizuuhcx
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.fkodkokookcxkov
import kotlin.random.Random

class Hgctxvyygd : AppCompatActivity() {
    private var ivcokbokcv : Animation? = null
    private lateinit var aplqlppl : ActivityHgctxvyygdBinding
    private var skodokw : CountDownTimer? = null
    private lateinit var dpslpl : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aplqlppl = ActivityHgctxvyygdBinding.inflate(layoutInflater)
        setContentView(aplqlppl.root)
        dpslpl = getSharedPreferences("SCRS_MAIN_SW", MODE_PRIVATE)
        ivcokbokcv = AnimationUtils.loadAnimation(applicationContext, R.anim.sw_its_anim)
        mckxkiokokod()
        sppzplzko()

    }


    private fun sppzplzko() = with(aplqlppl){
        fdokfodk.startAnimation(ivcokbokcv)
        qplqpl.startAnimation(ivcokbokcv)
        cokdsko.startAnimation(ivcokbokcv)
        cxkoxvdij.startAnimation(ivcokbokcv)
        spaslppllpxplzpcls.startAnimation(ivcokbokcv)
        bokvkon.startAnimation(ivcokbokcv)
        spallpx.startAnimation(ivcokbokcv)
        lcxlvoxkoxckokodjiijf.startAnimation(ivcokbokcv)
        nvcvcmb.startAnimation(ivcokbokcv)
    }

    private fun mckxkiokokod() = with(aplqlppl){
        skodokw?.cancel()
        var deplw = 0
        skodokw  = object : CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
                deplw++
                if(deplw>12) deplw =0
                val gocvkobko = fkodkokookcxkov[deplw]
                ofodijdf.text = "Sweet main scores : $gocvkobko"


            }

            override fun onFinish() {
                val yasgdyags = fkodkokookcxkov[Random.nextInt(13)]
                dpslpl.edit().putInt("SCRS_MAIN_SW",yasgdyags).apply()
                ofodijdf.text = "Sweet main scores : $yasgdyags"
                Handler().postDelayed({
                    startActivity(Intent(this@Hgctxvyygd, Nzxiixiizuuhcx::class.java))
                },1000)

            }

        }.start()
    }


    override fun onDestroy() {
        super.onDestroy()
        skodokw?.cancel()
    }
}