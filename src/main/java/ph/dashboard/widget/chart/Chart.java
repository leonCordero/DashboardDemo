package ph.dashboard.widget.chart;

import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;
import ph.dashboard.widget.DataContainer;
import ph.dashboard.widget.Widget;

/**
 * Created by leon on 28/01/2017.
 */
@Component("chartWidget")
public class Chart extends Widget{

    @Override
    public String create(DataContainer data, String[] heads) {
        return null;
    }

    @Override
    public String create(DataContainer data) {
        final Context context = new Context();
        SpringTemplateEngine templateEngine = (SpringTemplateEngine) appContext.getBean(SpringTemplateEngine.class);
        context.setVariable("data", data.getCharData());
        context.setVariable("title", data.getTitle());
        context.setVariable("sizeTable", data.getSize());
        return templateEngine.process(getViewName(), context);
    }

    @Override
    protected String getViewName() {
        return "widgets/lineChart";
    }
}
