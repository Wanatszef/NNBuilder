package NetworkComponents.Neuron;

import Functions.Relu;
import NetworkComponents.Layer.Layer;
import NetworkComponents.Neuron.Neuron;

import java.util.List;
import java.util.Random;

public class OutputNeuron extends Neuron
{
    List<Double> weights;
    Layer previousLayer;

    @Override
    void calculateOutput()
    {
        double temp = 0;
        for(int i = 0; i< weights.size(); i++)
        {
            temp += weights.get(i) * getInput(i);
        }
        output = Relu.output(temp);
    }

    @Override
    void passForward()
    {

    }

    public void generateWeights()
    {
        Random rand = new Random();
        for(int i = 0; i < previousLayer.getNeurons().size(); i++ )
        {
            weights.add(rand.nextDouble()* 2 - 1);
        }
    }

    public void setPreviousLayer(Layer layer)
    {
        this.previousLayer = layer;
    }
}
