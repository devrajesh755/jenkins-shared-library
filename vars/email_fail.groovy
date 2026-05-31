def call(String email){
  emailext(
            to: "${email}",
            subject: "Build Failed",
            body: "🚫 Bad News: Build failed! Please check the logs.",
            attachmentsPattern: '**/result.json'
        )
}
