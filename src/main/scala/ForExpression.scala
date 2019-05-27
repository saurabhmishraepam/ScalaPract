class ForExpression {
}


object ForExpressionDemo{

  // Multi map processing

  def main(args : Array[String]) : Unit ={

    var myNum= 1 to 3

    var updatedMap=myNum.map(i=>(1 to i).map(j => j* i))

    println(updatedMap)

    var flattenMap= updatedMap.flatMap(i => (i))

    println(flattenMap);


    // with for expression we can achive it like below

    var outPut= for{
      i <- myNum
      j <- 1 to i
    } yield i * j

   println(outPut);

  }

}