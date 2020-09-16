import scala.io.StdIn.readLine

object LeapYear {
  def leapYear = {
    val year = readLine("Enter year: ").toInt
    if (year % 400 == 0) {
      println(year + " is a leap year")
    }
    else if (year % 4 == 0 && year % 100 != 0) {
      println(year+" is a leap year")
    }
    else
      println(year+" is not a leap year")
  }

  def main(args: Array[String]): Unit = {
    leapYear
  }
}
