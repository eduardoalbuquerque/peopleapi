package br.com.everis.personapi.service;

import br.com.everis.personapi.dto.PersonDTO;
import br.com.everis.personapi.entity.Person;
import br.com.everis.personapi.mapper.PersonMapper;
import br.com.everis.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository repository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public PersonService(PersonRepository repository){
        this.repository = repository;
    }

    public List<Person> listAll(){
        return repository.findAll();
    }

    public Optional<Person> findById(Long personId){
        return repository.findById(personId);
    }

    public Person savePerson(PersonDTO personDTO){

        return repository.save(PersonMapper.INSTANCE.toPerson(personDTO));

    }

    public void deletePerson(Long personId){
        repository.deleteById(personId);
    }
}
