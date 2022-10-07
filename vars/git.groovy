def call(Map config = [:]) {
  sh "git clone ${config.url} ${config.branch}"
}
