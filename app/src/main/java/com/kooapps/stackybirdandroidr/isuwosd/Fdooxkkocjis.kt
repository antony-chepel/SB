package com.kooapps.stackybirdandroidr.isuwosd
import android.webkit.WebSettings
import android.app.Application
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.webkit.WebView





class Fdooxkkocjis(odskodkookcko: Application): ViewModel() {
    val sokako = odskodkookcko.packageManager


    fun sisosakooxokzcjizxji(nvcnvjcijdi: String) {
        OneSignal.setExternalUserId(
            nvcnvjcijdi,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(eplwplplslpd: JSONObject) {
                    try {
                        if (eplwplplslpd.has("push") && eplwplplslpd.getJSONObject("push").has("success")) {
                            val gplpcvp = eplwplplslpd.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gplpcvp"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (eplwplplslpd.has("email") && eplwplplslpd.getJSONObject("email").has("success")) {
                            val splpwlpslpkoxokckzji =
                                eplwplplslpd.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $splpwlpslpkoxokckzji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (eplwplplslpd.has("sms") && eplwplplslpd.getJSONObject("sms").has("success")) {
                            val tokodkoijcjixjiv = eplwplplslpd.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $tokodkoijcjixjiv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    fun njvcvicjid(rpelpelplp: WebView): WebSettings{
        val osopspslxlxciixji = rpelpelplp.settings
        osopspslxlxciixji.mediaPlaybackRequiresUserGesture = false
        osopspslxlxciixji.loadWithOverviewMode = true
        osopspslxlxciixji.domStorageEnabled = true
        osopspslxlxciixji.useWideViewPort = true
        osopspslxlxciixji.javaScriptEnabled = true
        osopspslxlxciixji.userAgentString = osopspslxlxciixji.userAgentString.replace("; wv", "")
        osopspslxlxciixji.allowFileAccess = true
        osopspslxlxciixji.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        osopspslxlxciixji.setSupportMultipleWindows(false)
        osopspslxlxciixji.javaScriptCanOpenWindowsAutomatically = true
        osopspslxlxciixji.builtInZoomControls = true
        osopspslxlxciixji.allowContentAccess = true
        osopspslxlxciixji.pluginState = WebSettings.PluginState.ON
        osopspslxlxciixji.allowContentAccess = true
        osopspslxlxciixji.displayZoomControls = false
        osopspslxlxciixji.allowFileAccess = true
        osopspslxlxciixji.cacheMode = WebSettings.LOAD_DEFAULT
        osopspslxlxciixji.setSupportZoom(true)
        return osopspslxlxciixji
    }

    fun eplwlplplpspadkoxko(forko: String): Boolean {
        try {
            sokako.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }













}