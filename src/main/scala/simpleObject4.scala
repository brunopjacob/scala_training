object simpleObject4 {
  def main(args: Array[String]): Unit = {
    var i = 0

    // Example: loop over a list range and store only even numbers
    var evenList = for {i <- 1 to 10 if (i % 2) == 0  } yield i

    // Print the resulting list
    for (i <- evenList){
      println(i)
    }
  }


}
