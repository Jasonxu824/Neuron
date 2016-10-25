package per.jasonxu.neuron;

import java.lang.reflect.InvocationTargetException;

import per.jasonxu.neuron.math.algebra.linear.common.Real;
import per.jasonxu.neuron.math.algebra.linear.vector.NColVector;
import per.jasonxu.neuron.math.algebra.linear.vector.NRowVector;
import per.jasonxu.neuron.math.algebra.linear.vector.NVector;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {	
    	Real[] data = {new Real(1.0f), new Real(2.0f)};
    	NVector<Real> vector = new NColVector<Real>(data);
    	Real[] data2 = {new Real(0.5f), new Real(0.6f)};
    	NVector<Real> vector2 = new NRowVector<Real>(data2);
    	System.out.println("Vector size is " + vector.getSize().getDimention() + ", data is " + vector.toString());
    	System.out.println("Dot res is " + vector.dot(vector2).toString());
    }
}
