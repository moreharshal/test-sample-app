pipeline {
    agent any

    stages{
        stage('build') {
            steps {
                withMaven(maven: 'maven-3.5.3'){
                  bat 'mvn clean'
                }
            }
        }
    }
 }

