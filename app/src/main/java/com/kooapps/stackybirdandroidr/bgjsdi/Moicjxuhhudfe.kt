package com.kooapps.stackybirdandroidr.bgjsdi
import android.app.Application
import org.koin.android.ext.koin.androidContext
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.vcbkockovpl
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.qpqpqqpwplsdok
import java.util.*
import android.content.Context
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.eplwlpwlppslldl
import com.kooapps.stackybirdandroidr.bgjsdi.siaokdwko.Uowoksxzc.fprplelp
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.bcxjivjijidjifjidji
import com.kooapps.stackybirdandroidr.isuwosd.suaijx.cxucxicxkokodofk
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level


class Moicjxuhhudfe: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(fprplelp)

        val ppbvlppv = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val elpwlwlplpsoakdkoxkozcokxz = getSharedPreferences("PREFS_NAME", 0)

        val gokovcko = MyTracker.getTrackerParams()
        val epwlpwlppwlplpspd = MyTracker.getTrackerConfig()
        val hhxciijvcxjivjidivj = MyTracker.getInstanceId(this)
        epwlpwlppwlplpspd.isTrackingLaunchEnabled = true
        val zozozkxokijsi = UUID.randomUUID().toString()

        if (elpwlwlplpsoakdkoxkozcokxz.getBoolean("my_first_time", true)) {
            gokovcko.setCustomUserId(zozozkxokijsi)
            ppbvlppv.edit().putString(qpqpqqpwplsdok, zozozkxokijsi).apply()
            ppbvlppv.edit().putString(eplwlpwlppslldl, hhxciijvcxjivjidivj).apply()
            elpwlwlplpsoakdkoxkozcokxz.edit().putBoolean("my_first_time", false).apply()
        } else {
            val jjcjcjcxhhxchud = ppbvlppv.getString(qpqpqqpwplsdok, zozozkxokijsi)
            gokovcko.setCustomUserId(jjcjcjcxhhxchud)
        }
        MyTracker.initTracker(vcbkockovpl, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Moicjxuhhudfe)
            modules(
                listOf(
                    bcxjivjijidjifjidji, cxucxicxkokodofk
                )
            )
        }
    }
}