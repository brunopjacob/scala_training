class MyClass (private val name: String, private val age: Int) /* primary constructor */ {

  // auxiliary constructor
  def test(): Unit = {
    println(name + " " + age)
  }
}

object TestMyClass{
  def main(args: Array[String]): Unit = {

    // creates instance of MyClass (variable m)
    val m = new MyClass(name="Test",age=18)

    // calls test() method of instance m
    m.test()

  }
}

