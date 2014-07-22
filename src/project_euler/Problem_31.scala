package project_euler

object Problem_31 extends App {

	def combinations(list: List[Int], n: Int = 200): Int = list match {
		  
		case head :: tail =>
		    if (head > n) 0 
		    else 
		      if (n == head) 1 
		      else combinations(list, n - head) + combinations(tail, n)
		
		case _ => 0
		}


	val coins  = List(1, 2, 5, 10, 20, 50, 100, 200)
	
	
	val result = combinations(coins)


	println(result)
}