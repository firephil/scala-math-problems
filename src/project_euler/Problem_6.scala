package project_euler

object Problem_6 extends App{

  def sumNaturals(start :Int =1 ,end :Int ):Long = (start to end).sum
  
  def sumOfSquares(start :Int =1, end :Int):Long = (start to end).toList.map(x => x*x ).sum
  
  println("test")
}