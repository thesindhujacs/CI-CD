pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker') {
            steps {
                bat 'docker build -t app .'
                bat 'docker run -d -p 8087:8080 app'
            }
        }
    }
}