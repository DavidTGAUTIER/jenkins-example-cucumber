pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh 'sudo ./mvnw clean test'
      }
    }
  }
}