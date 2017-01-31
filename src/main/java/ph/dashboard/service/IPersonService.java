package ph.dashboard.service;

import ph.dashboard.models.Person;

import java.util.List;
import java.util.Map;

/**
 * Created by leon on 26/01/2017.
 */
public interface IPersonService{
    List<Person> getPersons();
    Map<String, Double> getChartInfo();
}
