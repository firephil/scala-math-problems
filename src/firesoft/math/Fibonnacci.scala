package firesoft.math
import scala.annotation.tailrec

// if n > 46 integer overflow

object Fibonnacci {

		
	 /*	
	  * Fib(n) = 1/sqrt(5) * (phi^n - psi'^n)
	 	phi = (1 + sqrt(5) / 2)
	 	psi = (1 - sqrt(5) / 2)
	  * 
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
	
	def closedformBigDecimal (n : Int) : BigInt = {
	  
	   val root5 = Root.sqr(5).round(java.math.MathContext.DECIMAL128)
	   
	   val phi  = (1 + root5)/2
	   
	   val psi  = (1 - root5)/2
	   
	   val fn : BigDecimal = (phi.pow(n) -  psi.pow(n))/root5
	
	  fn.toBigInt
	 }
	
	
	import java.math.{BigDecimal => Decimal}
	import java.math.{BigInteger => JInt}
	import java.math.{MathContext => Round}
	
	def closedFormDecimal(n : Int) : JInt = {
	  
	  val root5 = JRoot.bigSqrt(new Decimal(5))
	  val phi = root5.add(new Decimal(1)).divide(new Decimal(2))
	  val psi = new java.math.BigDecimal(-1).add(root5).divide(new Decimal(2))
	  
	  val fn : Decimal = phi.pow(n).add(psi.pow(n).negate()).divide(root5,Round.UNLIMITED)
	  
	  fn.toBigInteger()
	}
	
	
	def cFormDecimal(n : Int) : BigInt = {
	  
	  val rt5 = JRoot.bigSqrt(new Decimal(5))
	  
	  val root5 = BigDecimal(rt5.toString,Round.UNLIMITED)
	  
	  val phi = (BigDecimal(1,Round.UNLIMITED) + root5)/ BigDecimal(2,Round.UNLIMITED)
	  
	  val psi = (BigDecimal(1,Round.UNLIMITED) - root5)/ BigDecimal(2,Round.UNLIMITED)
	  
	  val fn : BigDecimal = (phi.pow(n) -  psi.pow(n))/root5
	  
	  	  
	  fn.toBigInt
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