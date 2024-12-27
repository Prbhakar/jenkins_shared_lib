def call(String workspacePath = env.WORKSPACE, List<String> preserveFiles = []) {
    if (!workspacePath) {
        error "Workspace path is not provided or unavailable."
    }

    echo "Cleaning up workspace at: ${workspacePath}"
    
    try {
        if (preserveFiles) {
            echo "Preserving files: ${preserveFiles.join(', ')}"
            def preservePatterns = preserveFiles.collect { "! -name '${it}'" }.join(' ')
            sh """
            find ${workspacePath} -mindepth 1 ${preservePatterns} -exec rm -rf {} +
            """
        } else {
            sh """
            rm -rf ${workspacePath}/*
            """
        }
        echo "Workspace cleanup completed."
    } catch (Exception e) {
        error "Failed to clean up workspace: ${e.message}"
    }
}
