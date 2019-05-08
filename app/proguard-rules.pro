# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# Eyeofcloud
-keep class com.eyeofcloud.ab.** { *; }

# Gson
-keepnames class com.google.gson.Gson

# Safely ignore warnings about other libraries since we are using Gson
-dontwarn com.fasterxml.jackson.**
-dontwarn org.json.**

# Annotations
-dontwarn javax.annotation.**

# Findbugs
-dontwarn edu.umd.cs.findbugs.annotations.SuppressFBWarnings

# slf4j
-dontwarn org.slf4j.**

# Android Logger
-keep class com.noveogroup.android.log.** { *; }

# MD5
-keep class com.twmacinta.** { *; }
