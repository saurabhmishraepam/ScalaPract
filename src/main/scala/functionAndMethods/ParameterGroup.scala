package functionAndMethods

class ParameterGroup {


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

  def smartCompGroup(str1 : String, str2: String)( compFun:(String, String)=> Int ):Int={

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

object ParameterGroup{

  def main(args: Array[String]): Unit = {

    var ParameterGroup= new ParameterGroup

    println(ParameterGroup.smartComp("abc", "xyz",ParameterGroup.compare(false)))


    println(ParameterGroup.smartCompGroup("abc", "xyz")(ParameterGroup.compare(false)))

    //currying example

    val x= ParameterGroup.smartCompGroup(_:String, _:String)(ParameterGroup.compare(false))
    val y=ParameterGroup.smartCompGroup("abc","xyz")(_:(String, String) =>Int)

    println(x("x","y"))
    println(y(ParameterGroup.compare(true)))

  }

}
