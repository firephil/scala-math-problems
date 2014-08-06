package firesoft.math
import scala.annotation.tailrec
import firesoft.util.Timer

object Factorial 
{
  
     def recursive(n : Int) : Int = 
	 {
	   if(n==0) 1
	   else n * recursive(n-1)
	 }
	 
	 def tailRecursive(n : Int) : Int = 
	 {
	   @tailrec
	   def aux(n : Int, acc :Int) :Int = 
	   {
	     
		  if(n == 0) acc
		  else aux(n-1, acc * n)
	   }
	   aux(n,1)	   
	 }
	 
	 def functional(n : Int) :Int = { 
	  (1 to n).reduce(_ * _)
	 }
	 
	  def functionalFoldLeft(n : Int) :Int = { 
	  (1 to n).foldLeft(1)(_ * _)
	  }
	  
	  def functionalFoldRight(n : Int) :Int = { 
	  (1 to n).foldRight(1)(_ * _)
	  }
	 
	 
	  def imperative (n : Int) : Int = {
	   
	   0
	 }
	
	 
}