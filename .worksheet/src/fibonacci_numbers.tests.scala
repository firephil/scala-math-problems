package fibonacci_numbers

object tests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(126); 
  
	    lazy val fs: Stream[Int] = 0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2);System.out.println("""fs: => Stream[Int]""");$skip(36); 
      val res = fs.take(10).toArray;System.out.println("""res  : Array[Int] = """ + $show(res ));$skip(42); 
      
      val res1 = res(res.length-1);System.out.println("""res1  : Int = """ + $show(res1 ))}
   }
