def call(String email){
   emailext(
            to: "${email}",
            subject: "Build Successful",
            body: "Good News: Your build was successful.",
            attachmentsPattern: '**/result.json'
        )
}
