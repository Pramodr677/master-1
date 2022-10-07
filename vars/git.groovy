def call(String url) {
  sh "git init"
  sh "git clone ${url}"
}
