node {
    stage ("Checkout DataService"){
        git branch: 'main', url: ' https://github.com/foxwas/bah-mcc-data-day4.git'
    }
    
    stage ("Gradle Build - DataService") {
        sh 'gradle -b MetroConventionCenterTeam6/build.gradle clean build'

    }
    
    stage ("Gradle Bootjar-Package - DataService") {
        sh 'gradle -b MetroConventionCenterTeam6/build.gradle bootjar'
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
