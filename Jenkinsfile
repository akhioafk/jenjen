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
                echo "${some_variable}"
                bat "mvn test"
            }
        }
        stage("Print") {
            steps {
                echo "${some_variable}"
            }
        }
    }
}