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
        stage('Build') {
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
        stage('Sonar') {
             steps {
                 withSonarQubeEnv('localhost Sonar'){
                   bat 'mvn sonar:sonar -Dsonar.projectKey=MySampleJenkinTest -Dsonar.host.url=http://localhost:9000 -Dsonar.login=06fb912bb2be9bff756b94320131ab3b1c768a76'
                  }

             }
        }
        stage("Quality Gate"){
              steps{
              script {
                   timeout(time: 1, unit: 'HOURS') {
                       if (waitForQualityGate().status != 'OK') {
                           error "Pipeline aborted due to quality gate failure: ${qg.status}"
                       }
                   }
                   }
              }
        }
    }
 }

