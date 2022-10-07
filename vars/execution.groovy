def call(Map config = [:]) {
  sh "sudo ${config.package} install ansible -y"
  sh "cd ${config.path}"
  sh "cat inventory"
}
