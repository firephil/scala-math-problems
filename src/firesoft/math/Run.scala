package firesoft.math

import firesoft.util._


object Run extends App {
	
	
	//val fib = Timer.timeString(Fibonnacci.imperativeBig(n))
	//FileWriter.write(fib, "c://fibonnaci2.txt")
	
	
  
  
    val n = 50000
	
	Timer.timePrint(Fibonnacci.imperativeBig(n))
	Timer.time2file(Fibonnacci.imperativeBig(n))("c://fib.txt")
}



