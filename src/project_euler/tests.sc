package project_euler


/*
 * Testing the code
 * */

object test {
	
  
  val x = List(List(1,2,3))                       //> x  : List[List[Int]] = List(List(1, 2, 3))
  
  val y = List(100,200,300)                       //> y  : List[Int] = List(100, 200, 300)
  
 	val k = x zip y                           //> k  : List[(List[Int], Int)] = List((List(1, 2, 3),100))
 
  x.flatMap(x => Seq(x))                          //> res0: List[List[Int]] = List(List(1, 2, 3))
  
  
  val z = "testing the flatmap"                   //> z  : String = testing the flatmap

  
}