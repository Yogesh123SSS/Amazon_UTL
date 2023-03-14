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
				echo "${BUILD_URL}"
				//bat "mvn test"
			}
		}
		stage('compile'){
			steps{
				echo "Testing the code" 
				//bat "mvn compile"
			}
		}
	}
	post {
    		always {
      			testNG()
			 emailext to: "ramyapn95@gmail.com",
			 attachmentsPattern: '**/emailable-report.html',
                         subject: "${BUILD_URL}",
                         body: "Test"
    		}
  	}
}
