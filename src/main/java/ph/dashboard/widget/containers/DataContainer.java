package ph.dashboard.widget.containers;

import java.util.List;
import java.util.Map;

/**
 * Created by leon on 30/01/2017.
 */
public abstract class DataContainer<E> {

    protected Class<?> aClass;
    protected List<E> tableData;
    protected Map<String, Double> charData;
    protected String title;
    protected String size;

    public DataContainer() {
    }

    public DataContainer(Class<?> aClass, List<E> tableData, String title, String size) {
        this.aClass = aClass;
        this.tableData = tableData;
        this.title = title;
        this.size = size;
    }

    public DataContainer(Map<String, Double> charData, String title, String size) {
        this.charData = charData;
        this.title = title;
        this.size = size;
    }

    public void setaClass(Class<?> aClass) {
        this.aClass = aClass;
    }

    public void setTableData(List<E> tableData) {
        this.tableData = tableData;
    }

    public void setCharData(Map<String, Double> charData) {
        this.charData = charData;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Class<?> getaClass() {
        return aClass;
    }

    public List<E> getTableData() {
        return tableData;
    }

    public Map<String, Double> getCharData() {
        return charData;
    }

    public String getTitle() {
        return title;
    }

    public String getSize() {
        return size;
    }
}
