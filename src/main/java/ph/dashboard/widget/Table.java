package ph.dashboard.widget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 28/01/2017.
 */
@Component("tableWidget")
public class Table extends Widget {

    @Override
    public String create(WidgetDataContainer data, String[] heads) {
        final Context context = new Context();
        SpringTemplateEngine templateEngine = (SpringTemplateEngine) appContext.getBean(SpringTemplateEngine.class);
        List<List<String>> dataResolved = resolveData(data.getData(), heads);
        context.setVariable("data", dataResolved);
        context.setVariable("header", heads);
        context.setVariable("title", data.getTitle());
        return templateEngine.process(getViewName(), context);
    }

    @Override
    protected String getViewName() {
        return "widgets/simpleTable";
    }

    private List<List<String>> resolveData(List data, String[] tableHead) {
        List<List<String>> dataResolved = new ArrayList<List<String>>();
        List<String> tableFields = Arrays.asList(tableHead);
        if (data.size() > 0) {
            data.forEach((Object o) -> {
                List<String> row = new ArrayList<String>();
                tableFields.forEach(field -> {
                    try {
                        row.add(o.getClass().getField(field).get(o).toString());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                });
                dataResolved.add(row);
            });
            return dataResolved;
        } else {
            return dataResolved;
        }
    }

}
