package expressions

class ExpressionFirst {

}

object ExpressionFirst{

  def main(args: Array[String]): Unit = {
  /*
  Expression in scala
  last line the expression is the return statement
   */
    var exp={
        var pi=3.1
        pi * 1000
    }
    println(exp)
    /*
   Nested expression
     */
    var exp1={
       var pi=3.1
       pi * 1000;
      {
        var pi=3.14
        pi * 1000  // this will be the return statement
      }
    }
    println(exp1);

    /*
    nested scope in expression
     */
    var exp2={
      var pi=3.1;
      {
        var pi=3.14
        pi* 1000
      }
      pi * 1000 // this will be the return statement
    }
    println(s" result $exp2");

    // chaning of expression
    println(exp2-exp1)




  }






}


