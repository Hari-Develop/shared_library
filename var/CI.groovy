pipeline {
    agent {
        node { label 'workstation' }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'

            }
        }
        stage('Test') {
            steps {
                echo 'Testing the application...'
                // Add test commands here (e.g., unit tests)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment commands here
            }
        }
    }
}
