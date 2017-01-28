package ph.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ph.dashboard.models.Person;
import ph.dashboard.service.PersonService;
import ph.dashboard.widget.Widget;
import ph.dashboard.widget.WidgetDataContainer;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leon on 23/01/2017.
 */
@Controller
public class HomeController {

    @Autowired
    PersonService personService;

    @Resource(name = "complexTableWidget")
    Widget complexTable;

    @Resource(name = "tableWidget")
    Widget table;

    @RequestMapping(value = "/")
    public ModelAndView index(ModelAndView modelAndView) {

        List<Person> people = personService.getPersons();
        String[] header = {"name", "address", "age", "email", "sex"};

        WidgetDataContainer<Person> widgetDataContainer = new WidgetDataContainer<Person>(Person.class, people, "Person Table");

        modelAndView.addObject("complexTable", complexTable.create(widgetDataContainer, header));
        modelAndView.addObject("simpleTable", table.create(widgetDataContainer, header));
        modelAndView.setViewName("content/testContent");
        return modelAndView;
    }
}
