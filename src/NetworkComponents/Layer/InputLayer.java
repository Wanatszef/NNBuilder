package NetworkComponents.Layer;

import NetworkComponents.Layer.Layer;
import NetworkComponents.Neuron.InputNeuron;
import NetworkComponents.Neuron.Neuron;

import java.util.ArrayList;
import java.util.List;

public class InputLayer extends Layer
{
    Layer nextLayer;
    public InputLayer(int count)
    {
        neurons = new ArrayList<Neuron>();
        for(int i = 0; i < count; i++ )
        {
            InputNeuron inputNeuron = new InputNeuron();
            neurons.add(new InputNeuron());

        }
    }

    public void passForward()
    {
        for(Neuron nr : neurons)
        {
            if(nr instanceof InputNeuron)
            {
               ((InputNeuron) nr).passForward();
            }
        }
    }

    public void setNextLayer(Layer nxtLayer)
    {
        this.nextLayer = nxtLayer;
        for(Neuron neuron : neurons)
        {
            if(neuron instanceof InputNeuron)
            {
                InputNeuron inputNeuron = (InputNeuron) neuron;
                inputNeuron.setNextLayer(nxtLayer);
            }
            else
            {System.out.println("neuron :" + neuron + "isnt't instance of InputNeuron");}
        }
    }
}
