def call(String containerName){
    sh "docker compose up -d --build ${containerName}"
}
