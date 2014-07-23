package project_euler


object Problem_31 extends App {


	  def combinations(list: List[Int], n: Int = 200): Int = list  match {
			  
			case head :: tail => // match a non empty list 
			    if (head > n) 0 
			    else 
			      if (n == head) 1 
			      else combinations(list, n - head) + combinations(tail, n)
			
			case _ => 0
			}
	  
	 
	  def imper(list:List[Int],n: Int): Int = {	
		 
	     val comb = 1 +: Array.fill(n)(0)  
		
		  
		  for (c <- list; i <- c to n)
				  comb(i) += comb(i-c)
				  
		comb(n)
	  }
	  
	val list = List(1,2,5,10,20,50,100,200)
	
	Timer.time(combinations(list,200))
	Timer.time(imper(list,200))

}