def call(String msg = 'Build Stage'){
  echo "${msg}"
  sh 'mvn clean package'
}
