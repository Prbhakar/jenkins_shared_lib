def call(String repoUrl, String branch, String workdir){
   //def workingDir = "${env.WORKSPACE}"
   sh "echo received workspace name from pipeline: ${workdir}"
   sh "git clone ${repoUrl} ${workdir}"
   sh "git checkout ${branch}"
   return workingDir
}