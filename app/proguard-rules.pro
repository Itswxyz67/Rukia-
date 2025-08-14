# Add project specific ProGuard rules here.
# You can find more information on https://www.guardsquare.com/manual/configuration/index.html
#
# If you are using Kotlin, you might want to add the following line:
#-keep class kotlin.Metadata { *; }

# Keep the following rules for coroutines
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory { *; }
-keepnames class kotlinx.coroutines.android.AndroidDispatcherFactory { *; }
-keepclassmembers class kotlinx.coroutines.android.AndroidDispatcherFactory {
    private final transient java.lang.Object main;
}

# Keep the following rules for Retrofit
-dontwarn retrofit2.Platform$Java8
-keep class retrofit2.Platform$Java8 { *; }
-keepclassmembers class * {
    @retrofit2.http.* <methods>;
}
-keepattributes Signature
-keepattributes *Annotation*

# Keep the following rules for Gson
-keep class com.google.gson.stream.** { *; }
-keep class com.google.gson.** { *; }
-keep class * extends com.google.gson.TypeAdapter

# Keep the following rules for Coil
-if class coil.disk.DiskLruCache
-keep class coil.disk.DiskLruCache { *; }
-if class okhttp3.Cache
-keep class okhttp3.Cache { *; }
-if class okio.SegmentedByteString
-keep class okio.SegmentedByteString { *; }
