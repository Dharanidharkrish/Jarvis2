def call(String msg = 'Build Stage'){
  sh 'mvn clean package'
  echo "${msg}"
}
