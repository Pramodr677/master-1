def call(Map config = [:]) {
  sh "sudo ${config.package} install ansible -y"
  sh "ansible-playbook -i ${config.path}/inventory ${config.path}/${config.playbook_name}"
}
