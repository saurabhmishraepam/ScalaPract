package functionAndMethods

class ClousuresOne {

  def execute(f:(String)=>Unit, name: String): Unit =  {
    f(name)
  }
}

object ClousuresOne{

  def main(args: Array[String]): Unit = {

    var clousuresOne=new ClousuresOne

    var greet="Hello"

    def printFun(name:String):Unit={
      println(s"$greet $name");
    }
    clousuresOne.execute(printFun,"saurabh")
    greet="Hola"
    clousuresOne.execute(printFun,"satish")
    greet="Hi"
    clousuresOne.execute(printFun,"gopi")

  }




}


