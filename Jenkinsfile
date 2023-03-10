pipeline{
	agent any
	stages{
		stage('Build'){
			steps{
				echo "Building the code"
				bat "mvn clean"
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
