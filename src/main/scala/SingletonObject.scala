class SingletonObject {

}


object singleton{
  def method(): Unit={
    // default method
    println("singleton object check");
  }

}

object MainObj{

  def main(args : Array[String]): Unit={

    singleton.method()

  }

}