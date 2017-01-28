package ph.dashboard.widget;

import java.util.List;

/**
 * Created by leon on 26/01/2017.
 */
public class WidgetDataContainer<E> {

    private Class<?> aClass;
    private List<E> data;
    private String title;

    public WidgetDataContainer(Class<?> type, List<E> data, String title) {
        this.aClass = type;
        this.data = data;
        this.title = title;
    }

    public Class<?> getaClass() {
        return aClass;
    }

    public void setaClass(Class<?> aClass) {
        this.aClass = aClass;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
