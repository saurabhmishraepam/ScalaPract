package expressions

class MatchExpression {

  def checkDayOfWeek(dayofWeek: String): String ={

    var toLowerString= (input: String) =>{
      input.toLowerCase
    }:String

    var dayOfWeekExpression = toLowerString(dayofWeek) match {
      case  "monday" => "Start of week"
      case  "sunday" => "end of week"
    }
    dayOfWeekExpression
  }

  def checkDayOfWeekWithDefault(dayofWeek: String): String ={

    var toLowerString= (input: String) =>{
      input.toLowerCase
    }:String

    var dayOfWeekExpression = toLowerString(dayofWeek) match {
      case  "monday" => "Start of week"
      case  "sunday" => "end of week"
      case _ => dayofWeek +" of the week"
    }
    dayOfWeekExpression
  }

  def checkDayOfWeekWithPatternGuards(dayofWeek: String): String ={

    var toLowerString= (input: String) =>{
      input.toLowerCase
    }:String

    var dayOfWeekExpression = toLowerString(dayofWeek) match {
      case  "monday" => "Start of week"
      case  "sunday" => "end of week"
      case day  if(day == "saturday" | day == "tuesday" )=> dayofWeek +" of the week pattern checked"
    }
    dayOfWeekExpression
  }


}

object MatchExpression{

  def main(args: Array[String]): Unit = {

    var dayOfWeek="Monday"

    val matchExpression= new MatchExpression
    println(s"Day Details :  "+matchExpression.checkDayOfWeek(dayOfWeek))

    dayOfWeek="Sunday"
    println(s"Day Details :  "+matchExpression.checkDayOfWeek(dayOfWeek))

    dayOfWeek="sunday"

    println(s"Day Details :  "+matchExpression.checkDayOfWeek(dayOfWeek))


    dayOfWeek="saturday"
    // matchError
    //println(s"Day Details :  "+matchExpression.checkDayOfWeek(dayOfWeek))


    println(s"Day Details :  "+matchExpression.checkDayOfWeekWithDefault(dayOfWeek))

    println(s"Day Details :  "+matchExpression.checkDayOfWeekWithPatternGuards(dayOfWeek))



  }

}

