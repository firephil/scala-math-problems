package firesoft.math
import java.math.{BigDecimal => Decimal}
import java.math.{BigInteger => JInt}
import java.math.{MathContext => Round}


object tests {
 
   val rt5 = JRoot.bigSqrt(new Decimal(5))        //> rt5  : java.math.BigDecimal = 2.23606797749978969640917366873127623544061835
                                                  //| 9611525724270897245410520925637804899414414408378782274969508176150773783504
                                                  //| 2532677244470738635863601215334527088667781731918791658112766453226398565805
                                                  //| 3576135041753378544720712831124545376700570435987792321519085006049853140760
                                                  //| 7494527584319053851044029243
	 val root5 = BigDecimal(rt5.toString,Round.UNLIMITED)
                                                  //> root5  : scala.math.BigDecimal = 2.23606797749978969640917366873127623544061
                                                  //| 8359611525724270897245410520925637804899414414408378782274969508176150773783
                                                  //| 5042532677244470738635863601215334527088667781731918791658112766453226398565
                                                  //| 8053576135041753378544720712831124545376700570435987792321519085006049853140
                                                  //| 7607494527584319053851044029243
	 
	 
	 val phi = (BigDecimal(1,Round.UNLIMITED) + root5)/ BigDecimal(2,Round.UNLIMITED)
                                                  //> phi  : scala.math.BigDecimal = 1.6180339887498948482045868343656381177203091
                                                  //| 7980576286213544862270526046281890244970720720418939113748475408807538689175
                                                  //| 2126633862223536931793180060766726354433389086595939582905638322661319928290
                                                  //| 2678806752087668927236035641556227268835028521799389616075954250302492657038
                                                  //| 037472637921595269255220146215
	 
	 
	 
	 }