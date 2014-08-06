package firesoft.math

object Fibonnaci extends App {


	def functional(n : Int) :Int = { 
	
	  lazy val fs: Stream[Int] = 0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)
                                                 
      val res = fs.take(n).toArray              
      
      val result = res(res.length-1)                

      result
	}
	
	 /*	
	  * Fib(n) = 1/sqrt(5) * (phi^n - psi'^n)
	 	phi = (1 + sqrt(5) / 2)
	 	psi = (1 - sqrt(5) / 2)
	  *  
	  */
	def closedform (n : Int) : Int = {
	  
	   0
	 }
	
}