def call(Map config = [:]) {
  sh "sudo ${config.package} install ansible -y"
  sh "cd ${config.path}"
  sh "cat /var/lib/jenkins/workspace/job1/main/elasticsearch/inventory"
}
