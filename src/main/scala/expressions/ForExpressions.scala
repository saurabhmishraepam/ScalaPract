package expressions

class ForExpressions {

}

object ForExpressions{


  def main(args: Array[String]): Unit = {

    var inputSeq= 1 to 10

    var outputSeq =
      for {
        i <- inputSeq
        j <- 1 to i
      } yield (i * j)
    println(outputSeq)


    var dayOfWeekList : List[String] =List("Monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")

    for(day <- dayOfWeekList){
      println(day)
    }

    val outputDays=for(day <- dayOfWeekList) yield{
      day.toLowerCase match {
        case "sunday" => day+" its a holiday"
        case "saturday" => day+" its a holiday"
        case "monday" => day+" its start of the week"
        case _ => day
      }
    }
    println(outputDays)


    val toLowerCaseFunction = (input: String) =>{
      input.toLowerCase
    }:String
    val matchDays= (day: String)  =>{
      day match {
        case "sunday" => day+" its a holiday"
        case "saturday" => day+" its a holiday"
        case "monday" => day+" its start of the week"
        case _ => day
      }
    }: String

    val outputAgain= for(day <- dayOfWeekList) yield {
     matchDays (toLowerCaseFunction(day))
    }

    println(outputDays);

  }

}


