def call(){
      echo "Building..."
      sh "docker build -t two-tier-flask_app ."
      echo "Building Completed..."
}
