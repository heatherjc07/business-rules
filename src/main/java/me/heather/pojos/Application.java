package me.heather.pojos;
import java.util.List;

/**
 * Created by heathercampbell on 26/01/2015.
 */
public class Application {

    private float area;
    private List<String> options;

    public float getArea()
    {
        return this.area;
    }

    public void setArea(float area)
    {
        this.area = area;
    }

    public List<String>  getOptions()
    {
        return this.options;
    }

    public void setOptions(List<String>  options)
    {
        this.options = options;
    }
}
