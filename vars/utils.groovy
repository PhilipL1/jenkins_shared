def printFromFunction() {
  println("I am printing from a function")
}

def replaceString() {
  def text = readFile file: "index.html"
  text = text.replaceAll("%BUILD_NUMBER%", "${BUILD_NUMBER}")
  writeFile file: "index.html", text: text
}

def checkString() {
  def text = readFile file: "index.html"
  if(text.contain("${BUILD_NUMBER}")) {
    echo "IT IS THERE"
    else {
      echo "NOT THERE"
    }
