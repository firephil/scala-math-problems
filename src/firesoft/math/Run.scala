package firesoft.math

import firesoft.util.Timer

object Run extends App {
	
	//Timer.time(Factorial.functional(6))
	
	
	
	//Timer.time(Factorial.functionalFoldLeft(5))
	//Timer.time(Factorial.functionalFoldRight(5))
	//Timer.time(Factorial.recursive(5))
	Timer.time(Factorial.tailRecursive(5))
	
}