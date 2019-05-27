class Collections {

  def method(): Unit ={

    var tmp=List(1 to 100)

   var tmp1= tmp :+101

   // tmp.groupBy(num=>(num % 10))

    tmp1.foreach(num=>println(num))




  }



}

object DemoCollection{

  def main(args: Array[String]): Unit ={
    var tmp=new Collections()

    tmp.method()

  }

}
