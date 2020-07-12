pipeline {
    agent any

    stages{
        stage('Clean') {
            steps {
                withMaven(maven: 'maven-3.5.3'){
                  bat 'mvn clean'
                }
            }
        }
        stage('build') {
            steps {
                withMaven(maven: 'maven-3.5.3'){
                  bat 'mvn install'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven: 'maven-3.5.3'){
                  bat 'mvn test'
                }
            }
        }
    }
 }

