def call(String msg = 'Sonar Qube'){
  withSonarQubeEnv('sonarqube'){
                     sh 'mvn sonar:sonar'
                }
  echo "${msg}"
}
