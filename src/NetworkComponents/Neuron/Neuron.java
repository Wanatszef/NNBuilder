package NetworkComponents.Neuron;

import java.util.ArrayList;
import java.util.List;

public abstract class Neuron
{
    List<Double> inputs = new ArrayList<>();
    double output;
    abstract void calculateOutput();
    abstract void passForward();

    public void addInput(double input)
    {
        inputs.add(input);
    }

    public double getInput(int index)
    {
        try
        {
           return inputs.get(index);
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("nie ma takiego indexu Listy");
        }
        return 0;
    }
}
