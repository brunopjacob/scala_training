object simpleObject3 {
  def main(args: Array[String]): Unit = {

    val alphabetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    // Example 1: simple for loop with range
    for (i <- 1 to 3) {
      println(i)
    }

    // Example 2: loop over string with indexes
    for (i <- 0 until alphabetLetters.length){
      println(alphabetLetters(i))
    }

    // Example 3: loop over string directly
    for (i <- alphabetLetters){
      println(i)
    }

  }
}
