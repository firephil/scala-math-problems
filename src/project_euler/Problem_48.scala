package project_euler
/*
Self powers
Problem 48

The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
*/
object Problem_48 extends App {

	  //Broken
  	  def imp : String = {
  	    
		  	    
		var result  = 1L
		
		for (i <- 1 to 10) {
			math.pow(result, i)
			    
			println(i)
			    
			println(math.pow(result, i))
  	    }
		""
  	  }
	  // fix
  	  def imper : String = {
  	    
	  	//var sum = java.math.BigInteger.ZERO
	  	var sum = BigInt(0)
	  	
	    //(1 to 1000).foreach(x => sum = sum.add((new java.math.BigInteger(x.toString)).pow(x)))
	   //(1 to 1000).foreach(x => sum = sum + BigInt(sum.pow(x)))
	   
	   
	   sum.toString.takeRight(10)
  	 }
  	 
  	 def imper2 : String = {
  	    
	  	var sum = java.math.BigInteger.ZERO
	    (1 to 1000).foreach(x => sum = sum.add((new java.math.BigInteger(x.toString)).pow(x)))
	    sum.toString.takeRight(10)
  	 }
  	  
  	  
  	  
  	 println (imper2)
	  
	  
}