dependencies {
    implementation(Libraries.Extensions.core)
    implementation(Libraries.Extensions.lifecycle)
    implementation(Libraries.Ui.compose)
    implementation(Libraries.Ui.material)
    implementation(Libraries.Ui.composePreview)
    implementation(Libraries.Ui.composeActivity)

    testImplementation(Libraries.Test.Unit.junit)

    androidTestImplementation(Libraries.Test.Feature.junit)
    androidTestImplementation(Libraries.Test.Feature.espresso)
    androidTestImplementation(Libraries.Test.Feature.composeUi)

    debugImplementation(Libraries.Test.Shared.composeUiTooling)
}