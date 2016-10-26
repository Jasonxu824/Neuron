package per.jasonxu.neuron;

import java.lang.reflect.InvocationTargetException;

import per.jasonxu.neuron.math.algebra.linear.common.Complex;
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
    	Complex[] data = {new Complex(1.0f, 1.0f), new Complex(2.0f, 2.0f)};
    	NVector<Complex> vector = new NColVector<Complex>(data);
    	Complex[] data2 = {new Complex(-0.5f, - 0.4f), new Complex(0.6f, 0.6f)};
    	NVector<Complex> vector2 = new NRowVector<Complex>(data2);
    	System.out.println("Vector size is " + vector.getSize().getDimention() + ", data is " + vector.toString());
    	System.out.println("Dot res is " + vector.dot(vector2).toString());
    	System.out.println(data[0].divide(data2[0]).toString());
    }
}
