def call() {
  slackSend channel: 'jenkinsassign', message: 'Your ${env.JOB_NAME} is suceesful.'
}  
