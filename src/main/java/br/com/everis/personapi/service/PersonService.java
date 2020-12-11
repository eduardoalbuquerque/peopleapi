package br.com.everis.personapi.service;

import br.com.everis.personapi.entity.Person;
import br.com.everis.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository){
        this.repository = repository;
    }

    public List<Person> listAll(){
        return repository.findAll();
    }

    public Optional<Person> findById(Long personId){
        return repository.findById(personId);
    }

    public Person savePerson(Person person){
        return repository.save(person);
    }

    public void deletePerson(Long personId){
        repository.deleteById(personId);
    }
}
