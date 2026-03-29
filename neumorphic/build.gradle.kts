plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    `maven-publish`
}

android {
    namespace = "org.bruce.neumorphic"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    buildTypes.getByName("release") {
        isMinifyEnabled = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }

    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    kotlinOptions.jvmTarget = "17"
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.ui)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "org.bruce"
            artifactId = "compose-neumorphism"
            version = "1.0.0-SNAPSHOT"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}