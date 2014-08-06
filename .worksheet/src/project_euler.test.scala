package project_euler


/*
 * Testing the code
 * */

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(230); 
	
		def fun[T](f: => T) : String = {
		
		 		f.toString
		 		//val name = Thread.currentThread().getStackTrace()(1).getMethodName()(1).toString
			
			//name
			};System.out.println("""fun: [T](f: => T)String""");$skip(34); 
			
			
			def zeta(x:Int) =  x*x;System.out.println("""zeta: (x: Int)Int""");$skip(25); val res$0 = 
			
			
			fun(zeta(5));System.out.println("""res0: String = """ + $show(res$0))}
                                           
}
