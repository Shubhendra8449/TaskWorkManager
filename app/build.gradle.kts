plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-kapt")
}

android {
    namespace = "com.infinityy.taskworkmanager"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.infinityy.taskworkmanager"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "1.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding =true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


    dependencies {
        implementation ("com.google.android.material:material:1.11.0")
        implementation ("androidx.appcompat:appcompat:1.6.1")
        implementation ("androidx.work:work-runtime:2.9.0")
        implementation ("androidx.work:work-runtime-ktx:2.9.0")
        // Dependency Injection

        implementation ("androidx.room:room-common:2.6.1")
        implementation ("androidx.room:room-ktx:2.6.1")
        implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation ("androidx.navigation:navigation-fragment-ktx:2.7.6")
        implementation ("androidx.navigation:navigation-ui-ktx:2.7.6")
        implementation("androidx.test.ext:junit-ktx:1.1.5")

        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")

        //com.std.user.coroutines.Coroutines for android
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")


        implementation ("androidx.fragment:fragment-ktx:1.5.7")


        //Live data and life cycles
        implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
        implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
        implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

        // Kotlin coroutine dependencies
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1..4")
        implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.4")
        //Room Database

        kapt ("androidx.room:room-compiler:2.6.1")
        implementation ("androidx.room:room-ktx:2.6.1")



        implementation ("androidx.room:room-runtime:2.6.1")
        annotationProcessor ("androidx.room:room-compiler:2.6.1")

        // To use Kotlin annotation processing tool (kapt)
        // To use Kotlin Symbol Processing (KSP)


        // optional - RxJava2 support for Room
        implementation ("androidx.room:room-rxjava2:2.6.1")

        // optional - RxJava3 support for Room
        implementation ("androidx.room:room-rxjava3:2.6.1")

        // optional - Guava support for Room, including Optional and ListenableFuture
        implementation ("androidx.room:room-guava:2.6.1")

        // optional - Test helpers
        testImplementation ("androidx.room:room-testing:2.6.1")

        // optional - Paging 3 Integration
        implementation ("androidx.room:room-paging:2.6.1")
        implementation ("com.google.code.gson:gson:2.10.1")

        implementation ("com.google.dagger:hilt-android:2.44")
        kapt ("com.google.dagger:hilt-compiler:2.44")

    }
// Allow references to generated code
kapt {
    correctErrorTypes =true
}
