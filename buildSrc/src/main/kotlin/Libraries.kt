object Libraries {
    object Extensions {
        const val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        const val lifecycle =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
    }

    object Ui {
        const val compose = "androidx.compose.ui:ui:${Versions.AndroidX.compose}"
        const val material = "androidx.compose.material:material:${Versions.AndroidX.compose}"
        const val composePreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.AndroidX.compose}"
        const val composeActivity =
            "androidx.activity:activity-compose:${Versions.AndroidX.activity}"
    }

    object Test {
        object Unit {
            const val junit = "junit:junit:${Versions.junit}"
        }

        object Feature {
            const val junit = "androidx.test.ext:junit:${Versions.AndroidX.junit}"
            const val espresso =
                "androidx.test.espresso:espresso-core:${Versions.AndroidX.espresso}"
            const val composeUi = "androidx.compose.ui:ui-test-junit4:${Versions.AndroidX.compose}"
        }

        object Shared {
            const val composeUiTooling =
                "androidx.compose.ui:ui-tooling:${Versions.AndroidX.compose}"
        }
    }

}
