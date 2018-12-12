val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
val stdLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

object Deps {
    object Kotlin {

    }

    object AndroidX {
        // Um zilhão de coisas aqui
    }

    object Dagger {
        // Compiler
        // Runtime
        // Android
    }
}

object Versions {
    const val kotlin = "1.3.11"
}