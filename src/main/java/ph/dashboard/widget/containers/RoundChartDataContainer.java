package ph.dashboard.widget.containers;

import java.util.List;
import java.util.Map;

/**
 * Created by leon on 05/03/2017.
 */
public class RoundChartDataContainer extends DataContainer {

    public RoundChartDataContainer() {
    }

    public RoundChartDataContainer(Map<String, Double> data) {
        this.charData = data;
    }

    public RoundChartDataContainer(Map<String, Double> data, String title, String size) {
        this.charData = data;
        this.title = title;
        this.size = size;
    }

    public RoundChartDataContainer(Map<String, Double> data, String title, String size, String color) {
        this.charData = data;
        this.title = title;
        this.size = size;
    }

    public Map<String, Double> getData() {
        return charData;
    }

}
