pipeline {
    agent any
    variables {
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