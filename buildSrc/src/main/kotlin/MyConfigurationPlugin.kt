import com.android.build.api.dsl.DynamicFeatureExtension
import com.android.build.gradle.*
import com.android.build.gradle.internal.plugins.DynamicFeaturePlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyConfigurationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.all {
            when (this) {
                is LibraryPlugin -> {
                    val extension = project.extensions.getByType(
                        LibraryExtension::class.java
                    )
                    extension.configureCommon()
                }
                is DynamicFeaturePlugin -> {
                    val extension = project.extensions.getByType(
                        DynamicFeatureExtension::class.java
                    )
                    (extension as BaseExtension).configureCommon()
                }
                is AppPlugin -> {
                    val extension = project.extensions.getByType(
                        AppExtension::class.java)
                    extension.configureCommon()
                    extension.configureApplication()
                }
            }
            project.commonTasks()
        }
    }
}
