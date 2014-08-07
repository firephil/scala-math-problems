package firesoft.math;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Uses Newton Raphson to compute the square root of a BigDecimal.
 * 
 * @author Luciano Culacciatti 
 * @url http://www.codeproject.com/Tips/257031/Implementing-SqrtRoot-in-BigDecimal
 */

public class JRoot {
	

	private static final BigDecimal SQRT_DIG = new BigDecimal(150);
	
	private static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());

	private static BigDecimal sqrtNewtonRaphson  (BigDecimal c, BigDecimal xn, BigDecimal precision){
	    BigDecimal fx = xn.pow(2).add(c.negate());
	    BigDecimal fpx = xn.multiply(new BigDecimal(2));
	    
	    BigDecimal xn1 = fx.divide(fpx,2*SQRT_DIG.intValue(),RoundingMode.HALF_DOWN);
	    xn1 = xn.add(xn1.negate());
	    BigDecimal currentSquare = xn1.pow(2);
	    BigDecimal currentPrecision = currentSquare.subtract(c);
	    currentPrecision = currentPrecision.abs();
	    if (currentPrecision.compareTo(precision) <= -1){
	        return xn1;
	    }
	    return sqrtNewtonRaphson(c, xn1, precision);
	}
	
	
	public static BigDecimal bigSqrt(BigDecimal c){
	    return sqrtNewtonRaphson(c,new BigDecimal(1),new BigDecimal(1).divide(SQRT_PRE));
	}
}
