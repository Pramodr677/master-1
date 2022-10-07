def call(Map config = [:]) {
  slackSend channel: '${config.channel_name}', message: 'Your ${env.JOB_NAME} is successful. Its build number and build url  are ${env.BUILD_NUMBER}  and ${env.BUILD_URL}.'
}  
