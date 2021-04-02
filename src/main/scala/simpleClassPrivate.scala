class simpleClassPrivate (private val name: String, private val age: Int) /* primary constructor */ {

  // auxiliary constructor
  def printNameAndAge(): Unit = {
    println(name + " " + age)
  }
}

object testSimpleClass{
  def main(args: Array[String]): Unit = {

    // creates instance of MyClass (variable m)
    val m = new simpleClassPrivate(name="Test",age=18)

    // calls test() method of instance m
    m.printNameAndAge()

    // Can't access attributes of m directly, as they are private
    //println("My name is: " + m.name) // will return an error
    //println("My age: " + m.age) // will return an error


  }
}

