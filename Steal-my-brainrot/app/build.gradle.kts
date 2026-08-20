plugins {
    id("com.android.application")
}

android {
    namespace = "com.zycon123.stealmybrainrot"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.zycon123.stealmybrainrot"
        minSdk = 24
        targetSdk = 35
        versionCode = 700
        versionName = "0.70.0-beta-rc1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
}
