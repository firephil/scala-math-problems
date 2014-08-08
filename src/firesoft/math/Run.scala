package firesoft.math

import firesoft.util._


object Run extends App {
	
	val n = 1010
	
	
	
	Timer.timePrint(Fibonnacci.imperativeBig(n))
	//FileWriter.write(fib, "c://fibonnaci2.txt")
	
    Timer.timePrint(FibClosedForm.decimal_scala(n))
	Timer.timePrint(FibClosedForm.decimal_java(n))
	    

}



