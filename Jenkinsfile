pipeline {

    agent any
    tools {
        maven 'Maven3'
        jdk 'JDK21' 
    }

    stages {

        stage('Clean') {
            steps {
                bat 'C:\\Users\\HELLO\\Downloads\\apache-maven-3.9.16-bin\\apache-maven-3.9.16\\bin\\mvn clean'
            }
        }

        stage('Execute Tests') {
            steps {
                bat 'C:\\Users\\HELLO\\Downloads\\apache-maven-3.9.16-bin\\apache-maven-3.9.16\\bin\\mvn test'
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