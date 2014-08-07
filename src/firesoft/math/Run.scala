package firesoft.math

import firesoft.util._


object Run extends App {
	
	//Timer.time(Factorial.functional(6))
	
	
	
	//Timer.time(Factorial.functionalFoldLeft(5))
	//Timer.time(Factorial.functionalFoldRight(5))
	//Timer.time(Factorial.recursive(5))
	//Timer.time(Factorial.tailRecursive(5))
    //Timer.time(Fibonnaci.functional(12))
	//val n = 22385
    //Timer.time(Fibonnaci.closedform(n))
	//Timer.time(Fibonnaci.imperative(n))
	//Timer.time(Fibonnaci.tailRecursive(n))
	//Timer.time(Fibonnaci.tailRecursiveBig(n))
	//Timer.time(Fibonnaci.imperativeBig(n))
	//Timer.time(Fibonnaci.closedformBig(n))
	//Timer.time(Fibonnaci.closedformBigDecimal(n))
	
	
	val n = 500
	
	val fib = Timer.timeString(Fibonnacci.imperativeBig(n))
	
	
	
	
	
	FileWriter.write(fib, "c://fibonnaci2.txt")
      
}



