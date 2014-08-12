package firesoft.math

import firesoft.util._
import java.math.MathContext

object Run extends App {
	
	val n = 1000
	
	
	
	
	//FileWriter.write(fib, "c://fibonnaci2.txt")
	
    //Timer.timePrint(FibClosedForm.decimal_scala(n))
	//Timer.timePrint(FibClosedForm.decimal_java(n))
	
	
	
	/* Timer.timePrint(Fibonacci.imperativeBig(n))
	 Timer.timePrint(Fibonacci.tailRecursiveBig(n))
	 
	 //limit n = 46
	 //Timer.timePrint(Fibonacci.imperative(n))
	 
	 //limit n = 92
	 //Timer.timePrint(Fibonacci.imperativeLong(n))
	 
	 Timer.timePrint(Fibonacci.stream(n))
	 Timer.timePrint(Fibonacci.zipStream(n))
	 */
	 //Timer.timePrint(Factorial.imperative(5))
	
	
	Timer.timePrint(Factorial.tailRecBig(n))
	 
	 Timer.timePrint(Factorial.imperativeBig(n))

}



