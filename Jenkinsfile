pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh 'chmod +x mvnw'
        sh './mvnw clean test'
      }
    }
  }
}