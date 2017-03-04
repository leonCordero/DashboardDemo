package ph.dashboard.widget.containers;

import java.util.Map;

/**
 * Created by leon on 30/01/2017.
 */
public class LineChartDataContainer extends DataContainer {

    private String color;

    public LineChartDataContainer() {
    }

    public LineChartDataContainer(Map<String, Double> data) {
        this.charData = data;
    }

    public LineChartDataContainer(Map<String, Double> data, String title, String size) {
        this.charData = data;
        this.title = title;
        this.size = size;
    }

    public LineChartDataContainer(Map<String, Double> data, String title, String size, String color) {
        this.charData = data;
        this.title = title;
        this.size = size;
        this.color = color;
    }

    public Map<String, Double> getData() {
        return charData;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
