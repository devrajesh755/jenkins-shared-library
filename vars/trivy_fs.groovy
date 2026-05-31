def call(){
   echo "Performing File System Scan..."
   sh "trivy fs . -o result.json"
    echo "File System Scanning Completed Successfully"
}
