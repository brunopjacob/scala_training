class simpleClassPublic(val name: String, val age: Int) /* primary constructor */ {
// Note: constructor variables are public by default

  // auxiliary constructor
  def printNameAndAge(): Unit = {
    println(name + " " + age)
  }
}

object testSimpleClassPublic{
  def main(args: Array[String]): Unit = {

    // creates instance of MyClass (variable m)
    val m = new simpleClassPublic(name="Bruno",age=30)

    // calls test() method of instance m
    m.printNameAndAge()

    // Because m was created with public variables in the constructor, we can
    // access variables of m directly
    println("My age: " +  m.age)
    println("My name: " + m.name)


  }
}

