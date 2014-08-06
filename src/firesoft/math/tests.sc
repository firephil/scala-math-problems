package fibonacci_numbers

object tests {
  
	    lazy val fs: Stream[Int] = 0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)
                                                  //> fs: => Stream[Int]
      val res = fs.take(10).toArray               //> res  : Array[Int] = Array(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
      
      val res1 = res(res.length-1)                //> res1  : Int = 34
   }