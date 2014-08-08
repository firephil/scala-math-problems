package firesoft.math

import firesoft.util._


object Run extends App {
	
	val n = 1010
	
	
	
	Timer.timePrint(Fibonnacci.imperativeBig(n))
	//FileWriter.write(fib, "c://fibonnaci2.txt")
	
    Timer.timePrint(Fibonnacci.cFormDecimal(n))
	Timer.timePrint(Fibonnacci.closedFormDecimal(n))
	    

}



