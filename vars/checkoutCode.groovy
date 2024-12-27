def call(String repoUrl, String branch, String workdir){
   def workingDir = "${workdir}"
   sh "echo received workspace name from pipeline: ${workdir}"
   sh "git clone ${repoUrl} ${workdir}"
   sh "git checkout ${branch}"
   return workdir
}