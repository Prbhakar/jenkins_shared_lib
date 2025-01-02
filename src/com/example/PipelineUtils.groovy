package com.example

//group similar methods together
class PipelineUtils {
    static void deleteWorkspace(String workspacePath) {
        println "Cleaning up workspace at: ${workspacePath}"
        println "Cleaning up workspace at src directory: ${workspacePath}"
        println "Cleaning up workspace at src directory: 02-01-2025"
        // Perform cleanup logic
         sh """
            rm -rf ${workspacePath}/*
            """
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
