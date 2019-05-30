package configuration

import java.util.logging.{Level, Logger}

import org.mongodb.scala.{Completed, FindObservable, MongoClient, MongoClientSettings, MongoCollection, MongoDatabase, Observable, Observer, ReadPreference, ServerAddress}

import configuration.entity.Candidate
class DBConfiguration {

  def database=MongoConnection.getDatabase(MongoConnection.getConnection())
}

object MongoConnection{

  def getConnection() : MongoClient ={

    val mongoClient =  MongoClient("mongodb://localhost:27017/")

   return mongoClient;
  }

  def getDatabase(mongoClient: MongoClient ) :MongoDatabase={

    return mongoClient.getDatabase("candidates")
  }

  def getCollection(): MongoCollection[Candidate] ={
  return   MongoConnection.getDatabase(MongoConnection.getConnection()).getCollection("CandidatesCollection")
  }



}
