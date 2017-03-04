package ph.dashboard.widget.containers;

import java.util.List;

/**
 * Created by leon on 26/01/2017.
 */
public class TableDataContainer<E> extends DataContainer<E>{

    public TableDataContainer() {
    }

    public TableDataContainer(Class<?> aClass, List<E> data) {
        this.aClass = aClass;
        this.tableData = data;
    }

    public TableDataContainer(Class<?> type, List<E> data, String title, String size) {
        this.aClass = type;
        this.tableData = data;
        this.title = title;
        this.size = size;
    }
}
