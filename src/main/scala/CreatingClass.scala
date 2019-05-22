// class with class variable but not accessible from outside
class CreatingClass (message : String) {
  // default invocation at the time of object creation
  println("calling it "+message);

}

// changing the class variable to member variable
class CreatingClassWithMemberVariable ( var message : String) {
  // default invocation at the time of object creation
  println("calling it "+message);

}


object Demo{

  def main(args : Array[String]) : Unit ={

    println("Main method called");
    val tmp=new CreatingClass("method ivoked")
    //tmp.message  cannot be accessed

    val tmp1=new CreatingClassWithMemberVariable("method ivoked")
    // can access it as this declared with the keyword member variable
    println(tmp1.message)
  }

}