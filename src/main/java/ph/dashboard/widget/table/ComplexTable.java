package ph.dashboard.widget.table;

import org.springframework.stereotype.Component;
import ph.dashboard.widget.containers.DataContainer;

/**
 * Created by leon on 28/01/2017.
 */
@Component("complexTableWidget")
public class ComplexTable extends Table {

    @Override
    public String create(DataContainer data, String[] heads) {
        return super.create(data, heads);
    }

    @Override
    protected String getViewName() {
        return "widgets/complexTable";
    }
}
