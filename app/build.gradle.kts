plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.xdustatom.auryxgamenews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.xdustatom.auryxgamenews"
        minSdk = 23
        targetSdk = 34
        versionCode = 120701
        versionName = "1.207.01"
    }

<<<<<<< HEAD
=======
    // ✅ ALLINEAMENTO JAVA / KOTLIN (FIX ERRORE JVM)
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

<<<<<<< HEAD
    kotlinOptions {
        jvmTarget = "17"
    }

=======
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            // default
        }
    }

    // ✅ COMPOSE
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
<<<<<<< HEAD
=======

    // ✅ KOTLIN JVM TARGET
    kotlinOptions {
        jvmTarget = "17"
    }
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45
}

dependencies {

    // Compose BOM
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
    implementation(composeBom)

    // Compose core
    implementation("androidx.activity:activity-compose:1.9.2")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.material3:material3")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

<<<<<<< HEAD
    // RSS parser (handles fetching + parsing)
    implementation("com.prof18.rssparser:rssparser:6.0.7")
=======
    // HTTP (RSS)
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45
}
