package apidocs.demo.apidocs.service;

import apidocs.demo.apidocs.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    List<Person> data = new ArrayList<>();

    public Person createPerson(Person person) {
        person.setId( (int)Math.round(Math.random()*1000000) );
        data.add(person);
        return person;
    }

    public List<Person> getAll(){
        return data;
    }

    public Person getById(int id){
       return data.stream().filter(person -> person.getId() == id).findAny().get();
    }
}
