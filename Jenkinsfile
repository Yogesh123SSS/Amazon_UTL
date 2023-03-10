pipeline{
	agent any
	tools{
		maven 'maven 3.9.0'
	}
	stages{
		stage('Build'){
			steps{
				echo "Building the code"
				sh 'mvn --version'
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
}
