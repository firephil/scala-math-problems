package project_euler

object Problem_6 extends App{
 
  def squareOfSum(r:Range ):Long ={
   val x = r.sum
   
   x*x
  }                                              
   
  def sumOfSquares(r:Range):Long = r.toList.map(x => x*x ).sum
                                                    
  
  def dif(r:Range) = squareOfSum(r) - sumOfSquares(r)
                                                  
  println(dif(1 to 100))                 
}