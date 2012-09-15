package tw.gasol.demo

import org.jibble.pircbot.*
import org.gradle.api.*
import org.gradle.*

class IrcPlugin extends BuildAdapter implements Plugin<Project>{

    void apply(Project project) {
        project.extensions.create("irc", IrcPluginExtension)
	project.gradle.addBuildListener(this)
    }

    @Override
    void buildFinished(BuildResult result) {

        def project = result.getGradle().getRootProject()

        def message = project.name
        if (result.failure != null) {
            message +=  " Build Failed"
        } else {
            message = " Build Successful"
        }

        project.irc.send(message)
    }
}
