pipeline {
    variables {
        some_variable = "value"
    }
    agent any
    stages {
        stage("Compile") {
            steps {
                bat "mvn compile"
            }
        }
        
        stage("Test") {
            steps {
                bat "mvn test"
                echo some_variable
            }
        }
    }
}