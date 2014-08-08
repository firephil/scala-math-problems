package firesoft.util


object Timer extends App{
  
  
  def timePrint[R](f: => R): Unit = {
		
	println(timeString(f))
  }
 
  def time[R](f: => R): Long = {
		val t0 = System.nanoTime()
		val r = f
		val t1 = System.nanoTime()
		
		val time = (t1-t0) /1000
		
	time
  }
  
  def timeString[R](f: => R): String = {
		val t0 = System.nanoTime()
		val r = f
		val t1 = System.nanoTime()
		
		val nanos = (t1-t0)
		
		val ms = nanos /1000000d
		
		val st = ms.toString.slice(0,5)
		
		val result = s"time taken $st ms \nThe result is: $r"
		
		result
}
  
  def time2file[R](f: => R)(path : String) : Unit = {
    
    FileWriter.write(timeString(f), path)
  }
 
  
  def average[R](times:Int = 10)(f: => R) : Unit = {
    
     
      var result = 0L
      var n = times
	  
      while(n > 0)
	  {
	    
	    result = result + time(f)
	    n = n-1
	  }
	  
      //average time taken
	 val average = result/(times*1000d)
	 println(s"time taken: $average ms ")
	
  }
}