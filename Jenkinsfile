pipeline {
    agent any
    stages {
        stage('Testing Environment') {
    when {
 		expression {
 			env.BRANCH_NAME!='master'
 		}
 	}
            steps {
            echo "Testing env"
                }
            }
        stage('Build') {
    when {
 		expression {
 			env.BRANCH_NAME!='master'
 		}
 	}
            steps {
                 echo "build"
                }
            }
        stage('Deploy') {
    when {
 		expression {
 			env.BRANCH_NAME!='master'
 		}
 	}
            steps {
                echo "deploy"
            }
        }
      stage('Production') {
 	when {
 		expression {
 			env.BRANCH_NAME=='developer'
 		}
 	}
           steps {
                echo "production"
                sh 'mvn package -DskipTests'
                sh 'docker image build -t="shahe/sfia-respon:latest" .'
                sh 'docker push shahe/sfia-respon:latest'

            }
        }
    }
}
