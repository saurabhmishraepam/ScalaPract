package functionAndMethods

class ClousureVotingAge {

  //variable declared
  var votingAge =18

  //method defined
  var isOfVotingAge=(age:Int)=> age>=votingAge



}

object ClousureVotingAgeDemo{

  def main(args: Array[String]): Unit = {


    def printResult(f:(Int)=>Boolean)(age: Int): Unit ={

      println(f(age))
    }

    var clousureVotingAge=new ClousureVotingAge


    printResult(clousureVotingAge.isOfVotingAge)(20)

    clousureVotingAge.votingAge=22

    printResult(clousureVotingAge.isOfVotingAge)(20)
  }


}

