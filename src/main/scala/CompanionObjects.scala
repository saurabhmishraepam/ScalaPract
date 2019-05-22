class CompanionObjects {

}

object HelloComp{
  private val message : String ="default message";

}
class HelloComp(val message: String = HelloComp.message){
  println(message)

}

class DemoCompanionClass{

  def main(args: Array[String]) : Unit={

    var tmp=new HelloComp();

  }

}




