object HarmonicNumber {
  //Using recursive function
  def harmonicNumber(number: Float): Float = {
    if (number < 2)
       1
    else
       (1 / number + (harmonicNumber(number - 1)))
  }
  def main(args: Array[String]): Unit = {
    println(harmonicNumber(10))
  }
}
