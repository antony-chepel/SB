# OkHttp
-keep class com.squareup.okhttp.** { *; }
-dontwarn com.squareup.okhttp.**
-dontwarn okhttp3.**
#Onesignal
-dontwarn com.onesignal.**
-keep class com.onesignal.ActivityLifecycleListenerCompat** {*;}
# Facebook
-keep class com.facebook.** {
   *;
}
#AppsFlyer
-keep class com.appsflyer.** { *; }
-keep public class com.android.installreferrer.** { *; }
#Mytracker
-keep class com.my.tracker.** { *; }
-dontwarn com.my.tracker.**
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient {
    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info getAdvertisingIdInfo(android.content.Context);
}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient$Info {
    java.lang.String getId();
    boolean isLimitAdTrackingEnabled();
}
-keep class com.android.installreferrer.** { *; }
-keep class com.android.vending.billing.** { *; }
-keep class com.android.billingclient.api.** { *; }