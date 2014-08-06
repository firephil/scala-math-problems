package project_euler


/*
 * Testing the code
 * */

object test {
	
		def fun[T](f: => T) : String = {
		
		 		f.toString
		 		//val name = Thread.currentThread().getStackTrace()(1).getMethodName()(1).toString
			
			//name
			}                         //> fun: [T](f: => T)String
			
			
			def zeta(x:Int) =  x*x    //> zeta: (x: Int)Int
			
			
			fun(zeta(5))              //> res0: String = 25
                                           
}