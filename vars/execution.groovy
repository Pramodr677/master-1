def call(Map config = [:]) {
  sh "sudo ${config.package} install ansible -y"
  sh "cd ${config.path}"
  sh "ansible-playbook -i inventory ${config.playbook_name} "
}
