package firesoft.math
import scala.math.BigDecimal

object Root extends App{

    // integer square root using JRoot java algorithm
  
	def sqr(n : Int) : BigDecimal = {
	  
	  JRoot.bigSqrt(new java.math.BigDecimal(n)) 
	}
	
}
 