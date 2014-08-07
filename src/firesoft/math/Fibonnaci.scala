package firesoft.math
import scala.annotation.tailrec

// if n > 46 integer overflow

object Fibonnaci {

		
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
	
	def closedformBig (n : Int) : Long = {
	  
	   val root5 = math.sqrt(5)
	   
	   val phi : Double = (1 + root5)/2
	   
	   val psi : Double  = (1- root5)/2
	   
	   val fn : Double = (math.pow(phi,n) -  math.pow(psi,n))/root5
	
	  fn.toLong
	 }
	
	def closedformBigDecimal (n : Int) : Long = {
	  
	   val root5 = math.sqrt(5)
	   
	   val phi : Double = (1 + root5)/2
	   
	   val psi : Double  = (1 - root5)/2
	   
	   val fn : BigDecimal = (BigDecimal(phi).pow(n) -  BigDecimal(psi).pow(n))/root5
	
	  fn.toLong
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
	
	def imperativeBig( n : Int ) : BigInt = {
	  var a = BigInt(0)
	  var b = BigInt(1)
	  var i = BigInt(0)	  
	 
	  while( i < n ) {
	    val c = a + b
	    a = b
	    b = c
	    i = i + 1
	  } 
	a
	}
	

	def tailRecursive(n :Int) : Int = {
	  //require( n <= 46)
	   @tailrec
	   def aux(n : Int, next :Int, acc :Int) :Int ={
	     
	     if(n == 0) acc
		  else aux(n-1, acc + next,next)
	   }
	  
	  aux(n,1,0)
	}
	
	def tailRecursiveBig(n :Int) : BigInt = {
	  
	  @tailrec
	   def aux(n : Int, next :BigInt, acc :BigInt) :BigInt ={
	     
	     if(n == 0) acc
		  else aux(n-1, acc + next,next)
	   }
	  
	  aux(n,1,0)
	}
	
	// not correct
	def functional(n : Int) :Int = { 
			
	  (0 to n).reduce(_+_)
	}
}