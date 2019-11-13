def call(){
  withSonarQubeEnv('sonarqube'){
                     sh 'mvn sonar:sonar'
                }
}
