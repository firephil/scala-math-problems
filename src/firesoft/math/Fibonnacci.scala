package firesoft.math
import scala.annotation.tailrec

// if n > 46 integer overflow

object Fibonacci {

	
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
	
	def imperativeLong( n : Int ) : Long = {
	  var a = 0L
	  var b = 1L
	  var i = 0L	  
	 
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
		
	def stream(n : Int) : BigInt = {
	  
	  def aux(h: BigInt, n: BigInt): Stream[BigInt] = h #:: aux(n, h + n)
	  
	  val res = aux(0, 1).take(n+1).takeRight(1)
	  
	 
	  res.head
	}
	
	def zipStream(n :Int) :BigInt = {
	  lazy val fibs: Stream[BigInt] = BigInt(0) #::BigInt(1) #::fibs.zip(fibs.tail).map { n => n._1 + n._2 }
	  fibs.take(n+1).takeRight(1).head
	}
	
}