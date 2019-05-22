class MethodOverloading {

  def printName(firstName : String ="", lastName: String =""): Unit ={

    println("Name is "+firstName+" "+lastName)
  }
}

object Main{

  def main(args : Array[String]): Unit={

    var tmp=new MethodOverloading();

    tmp.printName()
    tmp.printName("Saurabh")
    tmp.printName(lastName="Mishra")
    tmp.printName("Saurabh", "Mishra")
    tmp.printName(firstName="Saurabh", lastName="Mishra")
  }

}

