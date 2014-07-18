package project_euler


/*
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */

object Problem_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(335); 
	
   def func = (0 until 1000).filter(x => x % 3 ==0  || x % 5 ==0).sum;System.out.println("""func: => Int""");$skip(193); 
   
   def imper = {
    //collect all values into a vector
     {for {	i <- 0 until 1000
    	 	if( i % 3 ==0 || i % 5 ==0)
		}yield i
     }.sum //sum the values of the collected vector
   };System.out.println("""imper: => Int""");$skip(160); 
   
   //java style imperative
   def imper2 = {
     var sum = 0
     for (i <- 0 until 1000)
    	 	if( i % 3 ==0 || i % 5 ==0)
    	 	  sum +=i
    sum
   };System.out.println("""imper2: => Int""");$skip(160); 
   
   def imper3 = {
		var i,sum =0
		
		while (i < 1000) {
		 if( i % 3 ==0 || i % 5 ==0)
    	 	  sum +=i
    	 	  
		i+=1 //increase counter
		}
		sum
   };System.out.println("""imper3: => Int""");$skip(33); 
  
   val t1 = System.nanoTime();System.out.println("""t1  : Long = """ + $show(t1 ));$skip(18); 
   val res = func;System.out.println("""res  : Int = """ + $show(res ));$skip(43); 
   val t2 = (System.nanoTime() - t1 )/1000;System.out.println("""t2  : Long = """ + $show(t2 ));$skip(54); 
   println(s"The result is: $res time taken $t2 ms ")}

}
