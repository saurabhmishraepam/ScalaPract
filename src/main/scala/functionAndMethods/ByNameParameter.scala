package functionAndMethods

class ByNameParameter {

  def method(name: String): Unit={
    println(s"Hello $name")
  }
  def methodfetch(name : String): String ={
    println("invoked methodFetch") //executed first
    name.toLowerCase
  }
 /* def methodByName(name:=> String){
    println(s"Hello $name")
  }*/
}


object ByNameParameter{

  def main(args: Array[String]): Unit = {
   val  byNameParameter=new ByNameParameter
    byNameParameter.method(byNameParameter.methodfetch("saurabh"))

  }

}
