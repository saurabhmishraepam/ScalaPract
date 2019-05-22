class CaseClass {

}

case class Time(hour: Int =0, minutes: Int =0){
}

object DemoCase{

  def main(args: Array[String]): Unit={

    var timeFirst=Time(9,0)

    if(timeFirst==Time(9)){
      println("Case matching by default")

    }
    if(timeFirst!=Time(9,30)){
      println("case not matching")
    }

  }

}


