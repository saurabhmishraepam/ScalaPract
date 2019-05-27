class HandlingOptions {

}

case class CustomerHnadle(firstName : String ="", middleName : Option[String]= None, lastName : String ="")


object DemoHandlingOption{

  def main(args: Array[String]): Unit = {



  }

  def getMiddleName(middleName: Option[String] ) : String={

    middleName match{
      case Some(middleName) => middleName
      case None => "missing middlename"

    }

  }

}

