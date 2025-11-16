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

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
    }
}
