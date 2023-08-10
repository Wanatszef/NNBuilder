package NetworkComponents.Layer;

import NetworkComponents.Neuron.Neuron;

import java.util.List;

public abstract class Layer
{
    List<Neuron> neurons;

    public List<Neuron> getNeurons() {
        return neurons;
    }

}
