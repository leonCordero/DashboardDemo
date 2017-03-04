package ph.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ph.dashboard.models.Person;
import ph.dashboard.service.PersonService;
import ph.dashboard.widget.containers.LineChartDataContainer;
import ph.dashboard.widget.Widget;
import ph.dashboard.widget.containers.TableDataContainer;
import ph.dashboard.widget.size.SizeClass;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 23/01/2017.
 */
@Controller
public class HomeController {

    @Autowired
    private PersonService personService;

    @Resource(name = "complexTableWidget")
    private Widget complexTable;

    @Resource(name = "tableWidget")
    private Widget table;

    @Resource(name = "lineChartWidget")
    private Widget lineChart;

    @Resource(name = "donutChartWidget")
    private Widget donutChart;

    @Resource(name = "pieChartWidget")
    private Widget pieChart;

    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView modelAndView) {

        List<Person> people = personService.getPersons();
        String[] header = {"name", "address", "age", "email", "sex"};

        /*TABLES*/
        /*COMPLEX TABLE*/
        TableDataContainer<Person> tableDataContainer = new TableDataContainer<>(Person.class, people, "Person Table", SizeClass.BIG_SIZE);
        modelAndView.addObject("complexTable", complexTable.create(tableDataContainer, header));
        /*SIMPLE TABLES*/
        tableDataContainer.setSize(SizeClass.MIDDLE_SIZE);
        modelAndView.addObject("simpleTable", table.create(tableDataContainer, header));
        /*SIMPLE TABLES*/
        modelAndView.addObject("simpleTable2", table.create(tableDataContainer, header));

        /*CHARTS*/
        /*LINE CHART*/
        LineChartDataContainer lineChartDataContainer = new LineChartDataContainer(getChartInfo(), "Line Chart", SizeClass.BIG_SIZE);
        lineChartDataContainer.setColor("#378ddd");
        modelAndView.addObject("lineChart", lineChart.create(lineChartDataContainer));

        /*DONUT CHART*/
        lineChartDataContainer.setSize(SizeClass.MIDDLE_SIZE);
        lineChartDataContainer.setTitle("Donut Chart");
        modelAndView.addObject("donutChart", donutChart.create(lineChartDataContainer));

        /*PIE CHART*/
        lineChartDataContainer.setSize(SizeClass.MIDDLE_SIZE);
        lineChartDataContainer.setTitle("Pie Chart");
        modelAndView.addObject("pieChart", pieChart.create(lineChartDataContainer));


        modelAndView.setViewName("content/testContent");
        return modelAndView;
    }

    private Map<String,Double> getChartInfo() {
        return personService.getChartInfo();
    }


}
