library identifier: 'library@master', retriever: modernSCM(
  [$class: 'GitSCMSource', credentialsId: '008d3ef4-bb08-432d-976a-d0968fa11084', 
   remote: 'https://github.com/akshayttn/shared-library', traits: [gitBranchDiscovery()]])
pipeline {
  agent any 
  options{
    ansiColor('xterm')
  }
  stages {
    
    stage ('Error and color') {
    steps {
      script {
        log.info("Successfully Executed")
        log.warn("Error")
      }
    }
  }
          stage('Git Commit'){
            steps {
              script {
                def gitId=sh(script:'git rev-parse HEAD', returnStdout: true)
                log.gitId(gitId)
              }
            }
          }
        }
}

    

