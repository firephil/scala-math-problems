package project_euler


/*
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */

object Problem_1 extends App{
	
   def func = (0 until 1000).filter(x => x % 3 ==0  || x % 5 ==0).sum
                                                  //> func: => Int
   
   def imper = {
    //collect all values into a vector
     {for {	i <- 0 until 1000
    	 	if( i % 3 ==0 || i % 5 ==0)
		}yield i
     }.sum //sum the values of the collected vector
   }                                              //> imper: => Int
   
   //java style imperative
   def imper2 = {
     var sum = 0
     for (i <- 0 until 1000)
    	 	if( i % 3 ==0 || i % 5 ==0)
    	 	  sum +=i
    sum
   }                                              //> imper2: => Int
   
   def imper3 = {
		var i,sum =0
		
		while (i < 1000) {
		 if( i % 3 ==0 || i % 5 ==0)
    	 	  sum +=i
    	 	  
		i+=1 //increase counter
		}
		sum
   }                                              //> imper3: => Int
  
   val t1 = System.nanoTime()                     //> t1  : Long = 88325480457338
   val res = func                                 //> res  : Int = 233168
   val t2 = (System.nanoTime() - t1 )/1000        //> t2  : Long = 30305
   println(s"The result is: $res time taken $t2 ms ")

}