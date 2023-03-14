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
		stage('Compile'){
			steps{
				echo "Testing the code" 
				bat "mvn compile"
			}
		}
		stage('Test'){
			steps{
				echo "Testing the code"
				bat "mvn test"
			}
		}
		
	}
	post {
    		always {
      			testNG()
			 emailext to: "ramyapn95@gmail.com",
			 attachmentsPattern: 'target/surefire-reports/emailable-report.html,target/surefire-reports/testng-results.xml',
                         subject: "Jenkins:Test Report",
			 body: '${BUILD_URL}:${BUILD_NUMBER}'  
    		}
  	}
}
