package firesoft.math
import java.math.{BigDecimal => Decimal}
import java.math.{BigInteger => JInt}
import java.math.{MathContext => Round}


object tests {
 
   //val rt5 = JRoot.bigSqrt(new Decimal(5))
	 //val root5 = BigDecimal(rt5.toString,Round.UNLIMITED)
	 
	 
	 //val phi = (BigDecimal(1,Round.UNLIMITED) + root5)/ BigDecimal(2,Round.UNLIMITED)
	 
	 Fibonacci.fib.take(10).foreach(println)  //> 0
                                                  //| 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
	 
	 }