node {
    stage ("Checkout DataService"){
        git branch: 'main', url: ' https://github.com/SLanciani/MCCTeam6ProjectDay2.git'
    }
    
    stage ("Gradle Build - DataService") {
        sh 'gradle -b MetroConventionCenterTeam6/build.gradle clean build'

    }
    
    stage ("Gradle Bootjar-Package - DataService") {
        sh 'gradle -b MetroConventionCenterTeam6/build.gradle bootjar'
    }
    
    stage ("Containerize the app-docker build - DataApi") {
        sh 'docker build -f MetroConventionCenterTeam6 --rm -t mcc-data:v1.0 .'
    }
    
    stage ("Inspect the docker image - DataApi"){
        sh "docker images mcc-data:v1.0"
        sh "docker inspect mcc-data:v1.0"
    }
    
    stage ("Run Docker container instance - DataApi"){
        sh "docker run -d --rm --name mcc-data -p 8080:8080 mcc-data:v1.0"
     }
    
    stage('User Acceptance Test - DataService') {
	
	  def response= input message: 'Is this build good to go?',
	   parameters: [choice(choices: 'Yes\nNo', 
	   description: '', name: 'Pass')]
	
	  if(response=="Yes") {

	    stage('Release- DataService') {
	     sh 'gradle -b MetroConventionCenterTeam6/build.gradle build -x test'
	     sh 'echo DataService is ready to release!'

	    }
	  }
    }
}
