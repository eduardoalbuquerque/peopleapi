package br.com.everis.personapi.service;

import br.com.everis.personapi.dto.PersonDTO;
import br.com.everis.personapi.entity.Person;
import br.com.everis.personapi.mapper.PersonMapper;
import br.com.everis.personapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepository repository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public PersonService(PersonRepository repository){

        this.repository = repository;
    }

    public List<PersonDTO> listAll(){
        List<Person> listAll= repository.findAll();
        return listAll.stream().map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<Person> findById(Long personId){

        return repository.findById(personId);
    }

    public PersonDTO savePerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);
        repository.save(personToSave);
        return personMapper.toDTO(personToSave);

    }

    public void deletePerson(Long personId){

        repository.deleteById(personId);
    }
}
