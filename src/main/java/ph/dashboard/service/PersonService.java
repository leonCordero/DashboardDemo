package ph.dashboard.service;

import org.springframework.stereotype.Service;
import ph.dashboard.models.IPerson;
import ph.dashboard.models.Person;

import java.util.*;

/**
 * Created by leon on 26/01/2017.
 */
@Service("personService")
public class PersonService implements IPersonService {

    @Override
    public List<Person> getPersons() {
        List<Person> people = new LinkedList<>();
        people.add(new Person("leon", 23, "male", "calle zafior y 11 #1101 la joya",
                "15215664", "elemail@email.com"));
        people.add(new Person("ilse", 27, "female", "calle 33 y coronado #3415 la obrera",
                "54564654", "ilseEmail@emai.com"));
        people.add(new Person("ray", 31, "male", "somewhere on dallas",
                "78945612", "raymundo@ray.com"));
        people.add(new Person("jorge", 35, "male", "somewhere on switzerland",
                "78454564", "jorgeemail@email.com"));
        people.add(new Person("juan", 23, "male", "somewhere on the mine",
                "78431234", "juanemail@email.com"));
        return  people;
    }

    @Override
    public Map<String, Double> getChartInfo() {
        Map<String, Double> map = new HashMap<>();
        Random random = new Random();
        getPersons().forEach(person -> {
            map.put(person.getName(), random.nextDouble());
        });
        return map;
    }

}
