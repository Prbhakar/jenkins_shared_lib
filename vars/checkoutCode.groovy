def call(String repoUrl, String branch String workdir){
   //def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workdir}"
   sh "git checkout ${branch}"
   return workingDir
}