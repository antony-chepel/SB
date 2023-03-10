package com.kooapps.stackybirdandroidr.isuwosd.suaijx
import java.util.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Looper
import android.os.Environment
import android.net.Uri
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.rpeple
import android.os.Bundle
import android.webkit.*
import android.util.Log
import android.provider.MediaStore
import android.os.Handler
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.fprlpeplplsdkodkos
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.qpqpqqpwplsdok
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.kooapps.stackybirdandroidr.isuwosd.Fdooxkkocjis
import java.text.SimpleDateFormat

class Booxixjcxuhdf : AppCompatActivity() {
    var xcokoxkovkoi = ""
    private val vcnnvnkcvbji by viewModel<Fdooxkkocjis>(
        named("BeamModel")
    )
    private var tprp = false
    lateinit var spllpsalp: WebView
    private  val deplpwe = 1

    private var tfkodko: String? = null
    private var xkockovko: ValueCallback<Array<Uri>>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        spllpsalp = WebView(this)
        setContentView(spllpsalp)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(spllpsalp, true)
        vcnnvnkcvbji.njvcvicjid(spllpsalp)

        spllpsalp.webViewClient = Rwpqpqplqlpslpdp()
        spllpsalp.webChromeClient = Uowowowokskoskox()
        spllpsalp.loadUrl(gkoocvokeowwwwsoo())
    }

    override fun onActivityResult(pfldp: Int, epwl: Int, tororokrkoork: Intent?) {

        if (pfldp != deplpwe || xkockovko == null) {
            super.onActivityResult(pfldp, epwl, tororokrkoork)
            return
        }
        var fdkodfkgko: Array<Uri>? = null

        if (epwl == RESULT_OK) {
            if (tororokrkoork == null) {
                if (tfkodko != null) {
                    fdkodfkgko = arrayOf(Uri.parse(tfkodko))
                }
            } else {
                val zxllcoxkco = tororokrkoork.dataString
                if (zxllcoxkco != null) {
                    fdkodfkgko = arrayOf(Uri.parse(zxllcoxkco))
                }
            }
        }
        xkockovko!!.onReceiveValue(fdkodfkgko)
        xkockovko = null
        return
    }




    inner class Rwpqpqplqlpslpdp: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (vcnnvnkcvbji.eplwlplplpspadkoxko(url)) {

                    val gokdfkogko = Intent(Intent.ACTION_VIEW)
                    gokdfkogko.data = Uri.parse(url)
                    startActivity(gokdfkogko)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            vjcjvcicivcji(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Booxixjcxuhdf, description, Toast.LENGTH_SHORT).show()
        }
    }




    fun vjcjvcicivcji(eplwpqlp: String?) {
        if (!eplwpqlp!!.contains("t.me")) {

            if (xcokoxkovkoi == "") {
                xcokoxkovkoi = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    eplwpqlp
                ).toString()

                val cxivhuhuxhud = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val spwplwppsokd = cxivhuhuxhud.edit()
                spwplwppsokd.putString("SAVED_URL", eplwpqlp)
                spwplwppsokd.apply()
            }
        }
    }


    override fun onBackPressed() {

        if (spllpsalp.canGoBack()) {
            if (tprp) {
                spllpsalp.stopLoading()
                spllpsalp.loadUrl(xcokoxkovkoi)
            }
            this.tprp = true
            spllpsalp.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                tprp = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }



    private fun gkoocvokeowwwwsoo(): String {
        val gokbkovkodfdfd = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val mvkcvkcioiccjuh = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val sdwdkokosokadlppxlpzclpp = gokbkovkodfdfd.getString(qpqpqqpwplsdok, null)
        val cycyxycxyyyxyc = gokbkovkodfdfd.getString(rpeple, null)
        val sskksmsdkmwidijijsajidji = gokbkovkodfdfd.getString(fprlpeplplsdkodkos, null)
        when (gokbkovkodfdfd.getString("WebInt", null)) {
            "campaign" -> {
                vcnnvnkcvbji.sisosakooxokzcjizxji(cycyxycxyyyxyc.toString())
            }
            "deepLink" -> {
                vcnnvnkcvbji.sisosakooxokzcjizxji(cycyxycxyyyxyc.toString())
            }
            "deepLinkNOApps" -> {
                vcnnvnkcvbji.sisosakooxokzcjizxji(sdwdkokosokadlppxlpzclpp.toString())
            }
            "geo" -> {
                vcnnvnkcvbji.sisosakooxokzcjizxji(sdwdkokosokadlppxlpzclpp.toString())
            }
        }
        return mvkcvkcioiccjuh.getString("SAVED_URL", sskksmsdkmwidijijsajidji).toString()
    }

    inner class Uowowowokskoskox : WebChromeClient() {

        override fun onShowFileChooser(
            fpdl: WebView?,
            spwllp: ValueCallback<Array<Uri>>?,
            vcpvl: FileChooserParams?
        ): Boolean {
            xkockovko?.onReceiveValue(null)
            xkockovko = spwllp
            var oaskodaskookxokczko: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (oaskodaskookxokczko!!.resolveActivity(packageManager) != null) {
                var tokgkokobvkoko: File? = null
                try {
                    tokgkokobvkoko = fprllpdlpspl()
                    oaskodaskookxokczko.putExtra("PhotoPath", tfkodko)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (tokgkokobvkoko != null) {
                    tfkodko = "file:" + tokgkokobvkoko.absolutePath
                    oaskodaskookxokczko.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(tokgkokobvkoko)
                    )
                } else {
                    oaskodaskookxokczko = null
                }
            }
            val eplwlpwlpls = Intent(Intent.ACTION_GET_CONTENT)
            eplwlpwlpls.addCategory(Intent.CATEGORY_OPENABLE)
            eplwlpwlpls.type = "image/*"
            val fplclpxvlp: Array<Intent?> = oaskodaskookxokczko?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val dsfpsdlpfdlps = Intent(Intent.ACTION_CHOOSER)
            dsfpsdlpfdlps.putExtra(Intent.EXTRA_INTENT, eplwlpwlpls)
            dsfpsdlpfdlps.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            dsfpsdlpfdlps.putExtra(Intent.EXTRA_INITIAL_INTENTS, fplclpxvlp)
            startActivityForResult(dsfpsdlpfdlps, deplpwe)
            return true
        }

        fun fprllpdlpspl(): File? {
            val cxokvkoxokvokd = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val swpldplwplps = "JPEG_" + cxokvkoxokvokd + "_"
            val fkovkocbko = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                swpldplwplps,
                ".jpg",
                fkovkocbko
            )
        }
    }









}

