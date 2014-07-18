package project_euler


/*
 * Testing the code
 * */

object test {
	
def time[R](f: => R): Unit = {
		val t0 = System.nanoTime()
		val r = f
		val t1 = System.nanoTime()
		
		val time = ((t1-t0)/1000)
		
	
	println(s"The result is: $r time taken $time ms ")
	
	
  }                                               //> time: [R](f: => R)Unit
  
  
  
  
  
  
}