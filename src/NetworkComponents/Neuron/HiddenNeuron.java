package NetworkComponents.Neuron;

import Functions.Relu;
import NetworkComponents.Layer.Layer;
import NetworkComponents.Neuron.Neuron;

import java.util.List;
import java.util.Random;

public class HiddenNeuron extends Neuron {
    double output;
    Layer nextlayer;
    Layer previousLayer;

    List<Double> weights;

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
        for(Neuron neuron : nextlayer.getNeurons())
        {
            neuron.addInput(this.output);
        }
    }

    public void generateWeights()
    {
        Random rand = new Random();
        for(int i = 0; i < previousLayer.getNeurons().size(); i++ )
        {
            weights.add(rand.nextDouble()* 2 - 1);
        }
    }


}
