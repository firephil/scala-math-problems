package project_euler

object Timer extends App{
  
  
  def time[R](f: => R): Long = {
		val t0 = System.nanoTime()
		val r = f
		val t1 = System.nanoTime()
		
		val time = ((t1-t0)/1000)
		
	
	//println(s"The result is: $r time taken $time ms ")
  
	time
  }
  
  def averageTimeTaken[R](f: => R)(times:Int = 10) : Unit = {
    
     
      var result = 0L
      var n = times
	  
      while(n > 0)
	  {
	    
	    result = result + time(f)
	    n = n-1
	  }
	  
      //average time taken
	  val average = result/times
	 println(s"time taken: $average ms ")
  }
  
  
  averageTimeTaken(Problem_1.func)(50)
  averageTimeTaken(Problem_1.imper2)(50)
  averageTimeTaken(Problem_1.imper3)(50)
  println("Time taken functional method: "+time(Problem_1.func))
}