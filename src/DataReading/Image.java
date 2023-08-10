package DataReading;

public class Image<T>
{
    private double[][] data;
    private T label;

    public Image(double[][] data, T label) {
        setData(data);
        setLabel(label);
    }

    public double[][] getData() {
        return data;
    }

    public void setData(double[][] data) {
        this.data = data;
    }

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }


}
