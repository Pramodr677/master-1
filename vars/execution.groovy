def call(Map config = [:]) {
  sh "sudo ${config.package} install ansible -y"
  sh "ansible-playbook -i ${config.pat}/inventory ${config.pat}/${config.playbook_name}"
}
