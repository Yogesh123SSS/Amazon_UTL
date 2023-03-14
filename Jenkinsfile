pipeline{
	agent any
	tools{
		maven 'maven 3.9.0'
	}
	stages{
		stage('Build'){
			steps{
				echo "Building the code"
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
			 emailext body: "Please go to ${env.BUILD_URL}.
			 to: "ramyapn95@gmail.com"
                         subject: "Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) is waiting for input",
			 replyTo:"yogeshkucv123@gmail.com"
    		}
  	}
}
