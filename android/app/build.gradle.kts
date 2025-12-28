import java.util.Properties

plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("com.google.firebase.firebase-perf")
}

val localProperties = Properties()
val localPropertiesFile = rootProject.file("local.properties")
if (localPropertiesFile.exists()) {
    localPropertiesFile.inputStream().use { localProperties.load(it) }
}

val flutterVersionCode = localProperties.getProperty("flutter.versionCode") ?: "1"
val flutterVersionName = localProperties.getProperty("flutter.versionName") ?: "1.0"

val keystoreProperties = Properties()
val keystorePropertiesFile = rootProject.file("key.properties")
if (keystorePropertiesFile.exists()) {
    keystorePropertiesFile.inputStream().use { keystoreProperties.load(it) }
}

android {
    namespace = "quiz.quizapp.mcqslearn"
    compileSdk = 36
    ndkVersion = "29.0.14033849"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    signingConfigs {
        create("release") {
            keyAlias = keystoreProperties.getProperty("keyAlias")
            keyPassword = keystoreProperties.getProperty("keyPassword")
            storeFile = keystoreProperties.getProperty("storeFile")?.let { file(it) }
            storePassword = keystoreProperties.getProperty("storePassword")
        }
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "quiz.mcqslearn"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = 24
        targetSdk = 36
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    flavorDimensions += "app"

    productFlavors {
		create("0") {
			dimension = "app"
			applicationIdSuffix = ".allinone"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101101") {
			dimension = "app"
			applicationIdSuffix = ".olevelbiology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101102") {
			dimension = "app"
			applicationId = "mainbuild.alevelbiologyapp"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101103") {
			dimension = "app"
			applicationIdSuffix = ".histology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101104") {
			dimension = "app"
			applicationIdSuffix = ".microbiology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101105") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.ninthbiology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101106") {
			dimension = "app"
			applicationId = "mainbuild.tenthbiologyapp"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101107") {
			dimension = "app"
			applicationIdSuffix = ".collegebiologyapp"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101108") {
			dimension = "app"
			applicationIdSuffix = ".cellbiology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101109") {
			dimension = "app"
			applicationIdSuffix = ".molecularbiology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101110") {
			dimension = "app"
			applicationIdSuffix = ".metabolism"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101111") {
			dimension = "app"
			applicationIdSuffix = ".phylum"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("101112") {
			dimension = "app"
			applicationIdSuffix = ".zoology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("102101") {
			dimension = "app"
			applicationIdSuffix = ".olevelchemistry"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("102102") {
			dimension = "app"
			applicationIdSuffix = ".alevelchemistry"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("102103") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.ninthchemistry"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("102104") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.tenthchemistry"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("102105") {
			dimension = "app"
			applicationIdSuffix = ".collegechem"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("103101") {
			dimension = "app"
			applicationIdSuffix = ".olevelphysics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("103102") {
			dimension = "app"
			applicationIdSuffix = ".alevelphysics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("103103") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.ninthphysics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("103104") {
			dimension = "app"
			applicationId = "mainbuild.tenthphysicsapp"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("103105") {
			dimension = "app"
			applicationIdSuffix = ".collegephy"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104101") {
			dimension = "app"
			applicationIdSuffix = ".bbahrm"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104102") {
			dimension = "app"
			applicationIdSuffix = ".mbahrm"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104103") {
			dimension = "app"
			applicationIdSuffix = ".bbamarketingmanagement"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104104") {
			dimension = "app"
			applicationIdSuffix = ".bbafinancialmanagement"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104105") {
			dimension = "app"
			applicationIdSuffix = ".bbafinancialmarkets"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104106") {
			dimension = "app"
			applicationIdSuffix = ".bbabusinessstatistics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104107") {
			dimension = "app"
			applicationIdSuffix = ".bbamarketingprinciples"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104108") {
			dimension = "app"
			applicationIdSuffix = ".bbacostaccounting"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104109") {
			dimension = "app"
			applicationIdSuffix = ".mbabusinessstatistics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104110") {
			dimension = "app"
			applicationIdSuffix = ".bbaappliedmath"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104111") {
			dimension = "app"
			applicationIdSuffix = ".mbaorganizationaldevelopment"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104112") {
			dimension = "app"
			applicationIdSuffix = ".mbaprojectmanagement"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("104113") {
			dimension = "app"
			applicationIdSuffix = ".bbabusinesseconomics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105101") {
			dimension = "app"
			applicationIdSuffix = ".bscsdatabasemanagementsystem"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105102") {
			dimension = "app"
			applicationIdSuffix = ".mscsdatabasemanagementsystem"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105103") {
			dimension = "app"
			applicationIdSuffix = ".bscsdigitallogicdesign"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105104") {
			dimension = "app"
			applicationIdSuffix = ".bscsoperatingsystems"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105105") {
			dimension = "app"
			applicationIdSuffix = ".bscssemanticweb"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105106") {
			dimension = "app"
			applicationIdSuffix = ".bscscomputerfundamentals"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105107") {
			dimension = "app"
			applicationIdSuffix = ".bscscomputernetworks"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105108") {
			dimension = "app"
			applicationIdSuffix = ".bscsdigitalimageprocessing"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105109") {
			dimension = "app"
			applicationIdSuffix = ".bscscomputerarchitecture"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("105110") {
			dimension = "app"
			applicationIdSuffix = ".bscscomputerbasics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("106105") {
			dimension = "app"
			applicationIdSuffix = ".collegemath"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("106106") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradesixmath"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("106108") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradeeightmath"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("107101") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradesixgeography"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("107102") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradesevengeography"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("107103") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradeeightgeography"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("108101") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradesixscience"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("108102") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradesevenscience"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("108103") {
			dimension = "app"
			applicationId = "quiz.mcqlearn.gradeeightscience"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("201101") {
			dimension = "app"
			applicationIdSuffix = ".engineeringmathematics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("201102") {
			dimension = "app"
			applicationIdSuffix = ".engineeringphysics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("202101") {
			dimension = "app"
			applicationIdSuffix = ".digitalelectronics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("202102") {
			dimension = "app"
			applicationIdSuffix = ".electronicdevices"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("202103") {
			dimension = "app"
			applicationIdSuffix = ".electromagnetictheory"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("202104") {
			dimension = "app"
			applicationIdSuffix = ".electriccircuitanalysis"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("202105") {
			dimension = "app"
			applicationIdSuffix = ".electroniccircuitdesign"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301101") {
			dimension = "app"
			applicationIdSuffix = ".biochemistry"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301102") {
			dimension = "app"
			applicationIdSuffix = ".globalwarming"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301103") {
			dimension = "app"
			applicationIdSuffix = ".marinepollution"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301104") {
			dimension = "app"
			applicationIdSuffix = ".psychology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301105") {
			dimension = "app"
			applicationIdSuffix = ".sociology"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301106") {
			dimension = "app"
			applicationIdSuffix = ".generalknowledge"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301107") {
			dimension = "app"
			applicationIdSuffix = ".internationalrelations"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301108") {
			dimension = "app"
			applicationIdSuffix = ".anthropologybasics"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}
		create("301109") {
			dimension = "app"
			applicationIdSuffix = ".humandiversity"
			versionCode = flutterVersionCode.toInt()
			versionName = flutterVersionName
		}

    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.4")
}
