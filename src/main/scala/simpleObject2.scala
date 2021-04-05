object simpleObject2 {
  def main(args: Array[String]): Unit = {
    var i = 0

    /* Use do while when you want to guarantee you
       will go through the loop at least once
    */
    do {
      println(i)
      i += 1
    } while (i<=7)
  }
}
