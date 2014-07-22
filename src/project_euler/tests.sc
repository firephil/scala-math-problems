package project_euler


/*
 * Testing the code
 * */

object test {
	
  def squareOfSum(r:Range ):Long ={
   val x = r.sum
   
   x*x
  }                                               //> squareOfSum: (r: Range)Long
  
  def sumOfSquares(r:Range):Long = r.toList.map(x => x*x ).sum
                                                  //> sumOfSquares: (r: Range)Long
  
  def dif(r:Range) = squareOfSum(r) - sumOfSquares(r)
                                                  //> dif: (r: Range)Long
  dif(1 to 100)                                   //> res0: Long = 25164150
}