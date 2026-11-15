pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Build is completed.....sc!'
                dir('WJavaSelenium') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy is completed.....sc!'
            }
        }

        stage('Test') {
            steps {
                echo 'Test is completed.....sc!'
                dir('WJavaSelenium') {
                    sh 'mvn clean test'
                }
            }
        }

        stage('Release') {
            steps {
                echo 'Release is completed.....sc!'
            }
        }
    }

    post {
        always {
            junit 'WJavaSelenium/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'WJavaSelenium/target/**', allowEmptyArchive: true
        }
    }
}
