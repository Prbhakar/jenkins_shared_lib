package com.example

class DockerHelper {
    /**
     * Builds a Docker image.
     * @param script - Jenkins pipeline script context (to access steps like sh).
     * @param imageName - Name of the Docker image to build.
     * @param dockerfile - Path to the Dockerfile (default: Dockerfile in current directory).
     */
    static void buildImage(script, String imageName, String dockerfile = 'Dockerfile') {
        script.sh "docker build -t ${imageName} -f ${dockerfile} ."
    }

    /**
     * Pushes a Docker image to a remote repository.
     * @param script - Jenkins pipeline script context.
     * @param imageName - Name of the Docker image to push.
     */
    static void pushImage(script, String imageName) {
        script.sh "docker push ${imageName}"
    }
}
