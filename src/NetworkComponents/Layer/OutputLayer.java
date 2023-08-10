package NetworkComponents.Layer;

import NetworkComponents.Layer.Layer;
import NetworkComponents.Neuron.HiddenNeuron;
import NetworkComponents.Neuron.InputNeuron;
import NetworkComponents.Neuron.Neuron;
import NetworkComponents.Neuron.OutputNeuron;

public class OutputLayer extends Layer
{
    Layer previousLayer;
    public OutputLayer(int size)
    {
        for (int i = 0; i < size; i++) {
            neurons.add(new HiddenNeuron());
        }
    }

    public void generateWeights()
    {
        for(Neuron neuron : neurons)
        {
            if(neuron instanceof OutputNeuron)
            {
                OutputNeuron outputNeuron = (OutputNeuron) neuron;
                outputNeuron.generateWeights();
            }
            else
            {
                System.out.println("Neuron nie jest klasy Outputneuron");
            }
        }
    }

    public void setPreviousLayer(Layer previousLayer)
    {
        this.previousLayer = previousLayer;
        for(Neuron neuron : neurons)
        {
            if(neuron instanceof OutputNeuron)
            {
                OutputNeuron outPutNeuron = (OutputNeuron) neuron;
                outPutNeuron.setPreviousLayer(previousLayer);
            }
            else
            {System.out.println("neuron :" + neuron + "isnt't instance of InputNeuron");}
        }
    }
}
