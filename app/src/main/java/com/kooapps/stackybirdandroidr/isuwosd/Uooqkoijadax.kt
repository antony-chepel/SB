package com.kooapps.stackybirdandroidr.isuwosd

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kooapps.stackybirdandroidr.R
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Hgctxvyygd
import com.kooapps.stackybirdandroidr.databinding.ActivityUooqkoijadaxBinding
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.ijcjixokdkoko
import kotlin.random.Random

class Uooqkoijadax : AppCompatActivity() {
    private lateinit var osakokxozkcjizxcjizcji : ActivityUooqkoijadaxBinding
    private var fokdfok = 2
    private lateinit var gkoocvk : SharedPreferences
    private val zppzlpskoko = listOf(
        R.drawable.sw_brst_1_choose,
        R.drawable.sw_brst_2_choose,
        R.drawable.sw_brst_3_choose,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        osakokxozkcjizxcjizcji = ActivityUooqkoijadaxBinding.inflate(layoutInflater)
        setContentView(osakokxozkcjizxcjizcji.root)
        gkoocvk = getSharedPreferences("SW_BRS_BNS", MODE_PRIVATE)
        duhus()
        osakokxozkcjizxcjizcji.bStr.setOnClickListener {
            startActivity(Intent(this, Hgctxvyygd::class.java))
        }
    }



    private fun duhus() = with(osakokxozkcjizxcjizcji){
        var gkocvko = 0
            fsdplls.setOnClickListener {
                if(gkocvko<2) {
                    val lsidus = ijcjixokdkoko[Random.nextInt(4)]
                    fokdfok = lsidus
                    gkoocvk.edit().putInt("SW_BRS_BNS",fokdfok).apply()
                    viocvbko.text = "$lsidus x sweets boost"
                    gkocvko += 1
                    if(gkocvko == 1){
                        lpsodokjciv.visibility = View.VISIBLE
                    } else if(gkocvko == 0){
                        lpsodokjciv.visibility = View.VISIBLE
                    }
                    fdisioo.setImageResource(zppzlpskoko[gkocvko])
                } else {
                    fsdplls.visibility = View.GONE
                    lpsodokjciv.visibility = View.VISIBLE
                }
            }

            lpsodokjciv.setOnClickListener {
                 if(gkocvko != 0) {
                     val lsidus = ijcjixokdkoko[Random.nextInt(4)]
                     fokdfok = lsidus
                     if(gkocvko == 1){
                         fsdplls.visibility = View.VISIBLE
                     } else if(gkocvko == 0){
                         fsdplls.visibility = View.VISIBLE
                     } else if(gkocvko == 2){
                         fsdplls.visibility = View.GONE
                     }
                     viocvbko.text = "$lsidus x sweets boost"
                     fdisioo.setImageResource(zppzlpskoko[gkocvko])

                     gkocvko -= 1
                     fdisioo.setOnClickListener {
                         fdisioo.setImageResource(zppzlpskoko[gkocvko])
                     }
                 } else {
                     val lsidus = ijcjixokdkoko[Random.nextInt(4)]
                     gkoocvk.edit().putInt("SW_BRS_BNS",fokdfok).apply()
                     viocvbko.text = "$lsidus x sweets boost"
                     fdisioo.setImageResource(zppzlpskoko[0])
                     lpsodokjciv.visibility = View.GONE
                     fsdplls.visibility = View.VISIBLE
                 }
            }

        }
    }
