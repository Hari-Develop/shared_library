pipeline {
    agent any  // Run on any available agent
    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                // Add build commands here (e.g., Maven, Gradle)
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