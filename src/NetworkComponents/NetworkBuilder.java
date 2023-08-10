package NetworkComponents;

import NetworkComponents.Layer.InputLayer;
import NetworkComponents.Layer.Layer;
import NetworkComponents.Layer.OutputLayer;

import java.util.LinkedList;
import java.util.List;

public class NetworkBuilder
{
    List<Layer> layersList = new LinkedList<>();
    NetworkBuilder(int hiddenCount, int inputSize, int outputSize)
    {
        if(hiddenCount == 0)
        {
            InputLayer inputLayer = new InputLayer(inputSize);
            OutputLayer outputLayer = new OutputLayer(outputSize);
            inputLayer.setNextLayer(outputLayer);
            outputLayer.setPreviousLayer(inputLayer);
        }
        if(hiddenCount == 1)
        {
            //tutaj dokoncz
        }
    }

}
