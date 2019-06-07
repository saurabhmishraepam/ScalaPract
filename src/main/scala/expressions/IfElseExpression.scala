package expressions

class IfElseExpression {

}

object IfElseExpression{

  def main(args : Array[String ]): Unit={

    val number : Double =1
    val denom : Double =0;

    var ifElse= if(denom !=0) { number/denom } else {None}
    // internally it uses type inference

    var ifElseDouble= if(denom !=0) { number/denom } else {0}

    println(ifElse)
  }


}

