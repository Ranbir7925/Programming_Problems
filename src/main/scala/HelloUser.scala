import scala.io.StdIn.readLine

object HelloUser {
  def main(args: Array[String]): Unit = {
    val username: String = readLine("Enter Your Name: ")
    println("Hello "+username+",How are you?")
  }

}

