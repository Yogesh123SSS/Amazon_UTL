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
				bat "mvn test"
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
			 mail to: "ramyapn95@gmail.com",
                         subject: "Test Email",
                         body: "Test"
			 
    		}
  	}
}
