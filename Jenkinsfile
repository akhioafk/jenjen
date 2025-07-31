pipeline {
    agent any
    environment {
        some_variable = "value"
    }
    stages {
        stage("Compile") {
            steps {
                bat "mvn compile"
            }
        }
        
        stage("Test") {
            steps {
                bat "mvn test"
                echo "${some_variable}"
            }
        }
    }
}