package ph.dashboard.widget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by leon on 28/01/2017.
 */
@Component("widget")
abstract public class Widget {

    @Autowired
    protected ApplicationContext appContext;

    public abstract String create(DataContainer data, String[] heads);

    public abstract String create(DataContainer data);

    protected abstract String getViewName();
}
