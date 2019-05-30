package configuration

import configuration._
import configuration.entity.Candidate
import org.mongodb.scala.{Completed, MongoCollection}
import org.mongodb.scala.bson.collection.mutable.Document

class application {

}


object application{

  def main(args: Array[String]): Unit = {

    var database=new DBConfiguration().database


    // get a handle to the "test" collection
    val collection: MongoCollection[Document] = database.getCollection("test")

    collection.drop

    // make a document and insert it
    val doc: Document = Document("_id" -> 0, "name" -> "MongoDB", "type" -> "database",
      "count" -> 1, "info" -> Document("x" -> 203, "y" -> 102))

    collection.insertOne(doc)

    // get it (since it's the only one in there since we dropped the rest earlier on)
    collection.find.first()

    // now, lets add lots of little documents to the collection so we can explore queries and cursors
    val documents: IndexedSeq[Document] = (1 to 100) map { i: Int => Document("i" -> i) }
    val insertObservable = collection.insertMany(documents)

    val insertAndCount = for {
      insertResult <- insertObservable
      countResult <- collection.countDocuments()
    } yield countResult





  }

}


