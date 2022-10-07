def call(Map config = [:]) {
  sh "${config.package} intall ansible -y"
  sh "cd ${config.path}"
  sh "ansible-playbook -i inventory ${config.playbook_name} "
}
