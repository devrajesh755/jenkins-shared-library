def call(){
      echo "Building..."
      sh "docker build -t two-tier-flask-app ."
      echo "Building Completed..."
}
