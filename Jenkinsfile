pipeline{
	agent any
	tools{
		maven 'maven 3.9.0'
	}
	stages{
		stage('Build'){
			steps{
				echo "Building the code"
				echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
				echo "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
				bat 'mvn --version'
			}
			
		}
		stage('Test'){
			steps{
				echo "Testing the code" 
				//bat "mvn test"
			}
		}
		stage('compile'){
			steps{
				echo "Testing the code" 
				bat "mvn compile"
			}
		}
	}
	post {
    		always {
      			 testNG()
                        subject: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"}
			emailext body: "from jenkins"
			to: "ramyapn95@gmail.com"
		         replyTo:"yogeshkucv123@gmail.com"
    		}
  	}

