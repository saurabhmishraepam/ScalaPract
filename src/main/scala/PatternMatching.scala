class PatternMatching {

}
 case class Custormer( firstName : String ="", lastName : String ="")

object DemoPatternMatch{


  def main(args: Array[String]): Unit = {
    var cust= Custormer("saurabh", "")


    def filterPatter(someValue : Any) : Boolean ={

      someValue match{
        case someValue : Custormer => true
        case _ =>false
      }

    }

    println(filterPatter(cust))
    println(filterPatter("check"))
  }


}

