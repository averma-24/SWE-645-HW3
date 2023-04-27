pipeline {
   environment {
        registryCredential = 'dockerID'
        TIMESTAMP = new Date().format("yyyyMMdd_HHmmss")
    }
   agent any
   tools {
    maven 'Maven3'
}

   stages {
    stage('Maven Clean') {
            steps {
               script{
                sh 'mvn clean'
               }
            }
        }
        stage('Maven Install') {
            steps {
               script{
                sh 'mvn install'
               
            }
            }
        }
      stage('Build Docker Image') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  def customImage = docker.build("averma24/hw3springboot:${env.TIMESTAMP}")
               }
            }
         }
      }

      stage('Push Image to Dockerhub') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  sh "docker push averma24/hw3springboot:${env.TIMESTAMP}"
               }
            }
         }
      }
      stage('Deploying to Rancher to single node(deployed in 3 replicas)') {
         steps {
            script{
               sh "kubectl set image deployment/spring-boot-assignment container-5=averma24/hw3springboot:${env.TIMESTAMP} -n default"
            }
         }
      }
   }
}
