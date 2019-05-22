class ImutableFields {

  var name : String=""
  var age : Int =10
  val company : String ="Epam"

}

object DemoSingleTon{

  def main(args: Array[String]) : Unit={

    var tmp=new ImutableFields()

    tmp.name="saurabh"
    tmp.age=30
    // cannot change val
    //tmp.company="epam"

  }


}

