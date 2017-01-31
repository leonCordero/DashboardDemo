package ph.dashboard.widget;

import java.util.Map;

/**
 * Created by leon on 30/01/2017.
 */
public class CharDataContainer extends DataContainer {

    public CharDataContainer() {
    }

    public CharDataContainer(Map<String, Double> data) {
        this.charData = data;
    }

    public CharDataContainer(Map<String, Double> data, String title, String size) {
        this.charData = data;
        this.title = title;
        this.size = size;
    }

    public Map<String, Double> getData() {
        return charData;
    }

}
