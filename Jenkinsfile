pipeline {
    agent any

    stages {
        stage('Testing Environment') {
	  when {
		expression {
			env.BRANCH_NAME=='developer'
		}
	}
            steps {
		echo "Testing"
		sh '. /home/manager/terraform-azure/ansible/ENV_VARIABLES.sh'
                sh 'mvn package -DskipTests'
                sh 'docker image build --build-arg PROFILE="testing" --build-arg PORT="3500" -t="51.140.99.70:5000/sfia-responsibilities:testing" .'
                sh 'docker push 51.140.99.70:5000/sfia-responsibilities:testing'
		sh '/home/manager/terraform-azure/backEndUpdate.sh'
                }
            }


        stage('Staging') {
	  when {
		expression {
			env.BRANCH_NAME=='staging'
		}
	}
            steps {
		echo "staging"
		sh '. /home/manager/terraform-azure/ansible/ENV_VARIABLES.sh'
                sh 'mvn package -DskipTests'
                sh 'docker image build --build-arg PROFILE="staging" -t="51.140.99.70:5000/sfia-responsibilities:staging" .'
                sh 'docker push 51.140.99.70:5000/sfia-responsibilities:staging'
		sh '/home/manager/terraform-azure/backEndUpdate.sh'
                 
                } 
            }


      stage('Production') {
	when {
		expression {
			env.BRANCH_NAME=='master'
		}
	}
            steps {
		echo "production"
		sh '. /home/manager/terraform-azure/ansible/ENV_VARIABLES.sh'
                sh 'mvn package -DskipTests'
                sh 'docker image build --build-arg PROFILE="production" -t="51.140.99.70:5000/sfia-responsibilities:production" .'
                sh 'docker push 51.140.99.70:5000/sfia-responsibilities:production'
		sh '/home/manager/terraform-azure/backEndUpdate.sh'
            }
        }
}
}
