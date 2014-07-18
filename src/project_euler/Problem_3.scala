package project_euler

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 								  Long.MaxValue = 9223372036854775807
 * 
 * */
object Problem_3 extends App {
  
	def factors(n: Long): List[Long] =	(2 to math.sqrt(n).toInt).find(n % _ == 0)
    .map(i => i.toLong :: factors(n / i)).getOrElse(List(n))

    val lastFactor= factors(600851475143L).last
    
    println("fast factor : "+lastFactor)
}