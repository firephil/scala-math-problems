package firesoft.math
import scala.annotation.tailrec

// if n > 46 integer overflow

object Fibonnaci extends App {


	def functional(n : Int) :Int = { 
			
	  (0 to n).reduce(_+_)
	}
	
	 /*	
	  * Fib(n) = 1/sqrt(5) * (phi^n - psi'^n)
	 	phi = (1 + sqrt(5) / 2)
	 	psi = (1 - sqrt(5) / 2)
	  *  
	  */
	def closedform (n : Int) : Int = {
	  
	   val root5 = math.sqrt(5)
	   
	   val phi = (1 + root5)/2
	   
	   val psi = (1- root5)/2
	   
	   val fn = (math.pow(phi,n) -  math.pow(psi,n))/root5
	
	   fn.toInt
	 }
	
	def imperative( n : Int ) : Int = {
	  var a = 0
	  var b = 1
	  var i = 0	  
	 
	  while( i < n ) {
	    val c = a + b
	    a = b
	    b = c
	    i = i + 1
	  } 
	a
	}
	
		
	def tailRecursive(n :Int) : Int = {
	  
	  @tailrec
	   def aux(n : Int, next :Int, acc :Int) :Int ={
	     
	     if(n == 0) acc
		  else aux(n-1, acc + next,next)
	   }
	  
	  aux(n,1,0)	
	}

	
}