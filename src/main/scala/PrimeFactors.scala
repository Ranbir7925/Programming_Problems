import scala.io.StdIn.readLine

object PrimeFactors {
  def main(args: Array[String]): Unit = {
    var number = readLine("Enter a number to find prime Factor: ").toInt
    print("Prime Factors are: ")
    for(i <-1.to(number)){
      if(i*i <= number)
        if (number%1==0)
          print(i+" ")
    }
  }
}
