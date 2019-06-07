package functionAndMethods

import java.util.Calendar

class Closures {


}

object Closures{

  def greeting=(lang: String) =>{
    var date=Calendar.getInstance().getTime.toString
    // outer scope
    lang match{
        //inner scope accessing variable of the outer scope
      case "English" => (name:String) => println("Hello "+name +" time "+date)
      case "French" => (name: String) =>println("Bonjur "+name +" time "+date)
      case "Hindi" => (name:String) => println("Namaste "+name +" time "+date)
      case _ => (name:String) =>println("Hi "+name)
    }
  }

  def main(args: Array[String]): Unit = {
    //this is pointing to closure variable local to the outer scope + nested function
    var greetingEng=greeting("English")
    var greetingFrench=greeting("French")
    var greetingHindi=greeting("Hindi")
    greetingEng("saurabh")
    greetingFrench("Rahul")
    greetingHindi("satish")

    var dataMod=dataModifier

    dataMod("rohit")

    var dataMod1=dataModifier
    dataMod("kunal")
  }


  def dataModifier={
          //outer scope values
    var data: Array[String]= Array("saurabh","satish", "gopi")


        (name:String)=>{
          data.update(0,name)
          data.foreach(v =>{println(v)})

        }
  }




}


