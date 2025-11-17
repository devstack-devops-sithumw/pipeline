pipeline {
    agent any

    tools {
        jdk 'jdk11'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/devstack-devops-sithumw/pipeline.git', branch: 'master'
            }
        }

        stage('Grant Execute Permission') {
            steps {
                // Make sure gradlew is executable
                sh 'chmod +x gradlew'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
    }
}
