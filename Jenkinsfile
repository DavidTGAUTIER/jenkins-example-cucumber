pipeline {
  agent {
    user 'jenkins'
    group 'jenkins'
  }
  stages {
    stage('Run Tests') {
      steps {
        sh './mvnw clean test'
      }
    }
  }
}