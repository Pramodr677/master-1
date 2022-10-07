def call(Map config = [;]) {
  sh "git clone ${config.remote_repo} ${config.branch}"
}
