package fibonacci_numbers

object tests {
  
	    lazy val fs: Stream[Int] = 0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)
                                                  //> fs: => Stream[Int]
      val res = fs.take(10).toArray               //> res  : Array[Int] = Array(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
      
      val res1 = res(res.length-1)                //> res1  : Int = 34
      Int.MaxValue                                //> res0: Int(2147483647) = 2147483647
      Int.MinValue                                //> res1: Int(-2147483648) = -2147483648
      Double.MaxValue                             //> res2: Double(1.7976931348623157E308) = 1.7976931348623157E308
      Double.MinValue                             //> res3: Double = -1.7976931348623157E308
      
      
      val root5 = math.sqrt(5)                    //> root5  : Double = 2.23606797749979
      val phi = (1 + root5)/2                     //> phi  : Double = 1.618033988749895
      
     val root51 = BigDecimal(5)                   //> root51  : scala.math.BigDecimal = 5
   
   }