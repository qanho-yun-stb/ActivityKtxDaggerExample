object Vers {
  val compile_sdk = 28
  val min_sdk = 28
  val target_sdk = 28

  val kotlin = "1.3.11"
  val couroutine = "1.0.1"
}

object Libs {
  val android_plugin = "com.android.tools.build:gradle:3.4.0-beta01"
  val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
  val versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.20.0"

  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Vers.kotlin}"
  val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.couroutine}"
  val ui_coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Vers.couroutine}"

  val ktx = "androidx.core:core-ktx:1.0.1"

  val appcompat = "androidx.appcompat:appcompat:1.0.2"
  val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"
  val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-alpha3"
  val cardview = "androidx.cardview:cardview:1.0.0"

  val activityx = "androidx.activity:activity-ktx:1.0.0-alpha03"
  val fragmentx = "androidx.fragment:fragment-ktx:1.1.0-alpha03"

  val material = "com.google.android.material:material:1.0.0"
  val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:1.0.0"

  val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0"
  val livedata = "androidx.lifecycle:lifecycle-livedata:2.0.0"
  val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:2.0.0"
  val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:2.0.0"

  private val vdagger = "2.21"
  val dagger = "com.google.dagger:dagger:$vdagger"
  val dagger_processor = "com.google.dagger:dagger-compiler:$vdagger"
  val dagger_android = "com.google.dagger:dagger-android:$vdagger"
  val dagger_android_processor = "com.google.dagger:dagger-android-processor:$vdagger"
  val dagger_android_support = "com.google.dagger:dagger-android-support:$vdagger"

  val junit = "junit:junit:4.12"
  val truth = "com.google.truth:truth:0.42"
  val test_rules = "androidx.test:rules:1.1.0"
  val test_runner = "androidx.test:runner:1.1.0"
  val test_junit_rules = "androidx.test.ext:junit:1.0.0"
  val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:1.5.0"
  val espresso = "androidx.test.espresso:espresso-core:3.1.0"
  val robolectric = "org.robolectric:robolectric:4.0"
}
