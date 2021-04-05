class simpleAuxiliaryConstructor(private val name: String, private val age: Int) /*This is the primary const. */ {

  //auxiliary constructor
  def this(name:String ) {
    this(name,27) //maps to primary constructor
  }

  def printNameAndAge(): Unit = {
    println(name + " " + age)
  }

}

private object TestMyClass{

  def main(args: Array[String]): Unit = {

    // creates instance of class simpleAuxiliaryConstructor as m
    // note: this will be initialized using primary constructor
    val m = new simpleAuxiliaryConstructor("Bruno", 30)

    // call method test() on object m
    m.printNameAndAge()

    // creates another instance of class simpleAuxiliaryConstructor as m1
    // note: this will be initialized using auxiliary constructor
    val m1 = new simpleAuxiliaryConstructor("Amanda")
    m1.printNameAndAge()

  }

}