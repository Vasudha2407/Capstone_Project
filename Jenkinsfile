pipeline {
    agent any

    tools {
        maven 'Maven3'   // IMPORTANT LINE
    }

    stages {
        stage('Clean') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
