package com.example

//group similar methods together
class PipelineUtils {
    static void deleteWorkspace(String workspacePath) {
        println "Cleaning up workspace at: ${workspacePath}"
        // Perform cleanup logic
    }

    static void buildProject(String projectPath) {
        println "Building project at: ${projectPath}"
        // Perform build logic
    }

    static void deployApplication(String environment, String artifactPath) {
        println "Deploying to ${environment} with artifact ${artifactPath}"
        // Perform deploy logic
    }
}