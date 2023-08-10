package NetworkComponents.Layer;

import NetworkComponents.Layer.Layer;
import NetworkComponents.Neuron.HiddenNeuron;
import NetworkComponents.Neuron.Neuron;

public class HiddenLayer extends Layer
{
    Layer nextLayer;
    Layer previousLayer;

    public HiddenLayer(int size) {
        for (int i = 0; i < size; i++) {
            neurons.add(new HiddenNeuron());
        }

    }

    public void generateWeights()
    {
        for(Neuron neuron : neurons)
        {
            if(neuron instanceof HiddenNeuron)
            {
                HiddenNeuron hiddenNeuron = (HiddenNeuron) neurons;
                hiddenNeuron.generateWeights();
            }
            else
            {
                System.out.println("Neuron nie jest klasy HiddenNeuron");
            }


        }
    }

    public Layer getNextLayer() {
        return nextLayer;
    }

    public void setNextLayer(Layer nextLayer) {
        this.nextLayer = nextLayer;
    }

    public Layer getPreviousLayer() {
        return previousLayer;
    }

    public void setPreviousLayer(Layer previousLayer) {
        this.previousLayer = previousLayer;
    }
}
