package ph.dashboard.widget;

import org.springframework.stereotype.Component;

/**
 * Created by leon on 28/01/2017.
 */
@Component("complexTableWidget")
public class ComplexTable extends Table {

    @Override
    public String create(WidgetDataContainer data, String[] heads) {
        return super.create(data, heads);
    }

    @Override
    protected String getViewName() {
        return "widgets/complexTable";
    }
}
