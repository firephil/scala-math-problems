package firesoft.math
import scala.annotation.tailrec

// if n > 46 integer overflow

object Fibonnacci {

	
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