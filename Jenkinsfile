pipeline {
    agent any

        stage('build') {
            steps {
                withMaven(maven: 'maven-3.5.3'){
                  cmd 'mvn clean'
                }
            }
        }
 }

