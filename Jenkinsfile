pipeline {

    agent any

    stages {

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Execute Tests') {
            steps {
                bat 'mvn test'
            }
        }

    }

    post {

        success {
            echo 'BUILD SUCCESS'
        }

        failure {
            echo 'BUILD FAILED'
        }

        always {
            echo 'EXECUTION COMPLETED'
        }
    }
}