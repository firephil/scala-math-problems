package firesoft.math
import scala.annotation.tailrec

object CommonGreaterDivisor extends App {
  
  
	  @tailrec
	  def gcd (a : Int, b :Int) : Int = 
	  {
	    
	     if(b == 0) a
	     
	     else
	    	 gcd(b, a % b )
	  }
  
	  
	  val x = gcd(20,6)
	  println(x)
}