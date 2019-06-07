package functionAndMethods

class HigherOrderFunction {

  def compareString(str1: String, str2: String) :Int={
    if(str1>str2)
      return 1
    else
      return -1
  }

  def compareStringReverse(str1: String, str2 : String): Int ={
    if(str1>str2)
      return -1
    else
      return 1
  }

  /*
  taking input a function
   */

  def smartComp(str1 : String, str2: String, compFun:(String, String)=> Int ):Int={

    compFun(str1, str2)
  }

  /*
  Higher order function returning a function
   */
  def compare( reverse: Boolean):(String, String) =>Int ={
    if(reverse)
    return compareStringReverse
    else
    compareString
  }
}

object HigherOrderFunction{

  def main(args: Array[String]): Unit = {
    var HigherOrderFunction= new HigherOrderFunction

    println(HigherOrderFunction.smartComp("abc", "xyz",HigherOrderFunction.compare(false)))
  }
}

