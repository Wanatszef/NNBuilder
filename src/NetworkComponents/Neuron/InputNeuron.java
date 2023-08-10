package NetworkComponents.Neuron;

import NetworkComponents.Layer.Layer;
import NetworkComponents.Neuron.Neuron;

public class InputNeuron extends Neuron
{
    Layer nextLayer;


    @Override
    void calculateOutput() {
        output = this.getInput(0);
    }

    @Override
    public void passForward()
    {
        for(Neuron neuron : nextLayer.getNeurons())
        {
            neuron.addInput(output);
        }
    }

    public void setNextLayer(Layer next)
    { nextLayer = next;}
}
