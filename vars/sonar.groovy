def call(body){
  withSonarQubeEnv('sonarqube'){
                     sh 'mvn sonar:sonar'
                }
}
