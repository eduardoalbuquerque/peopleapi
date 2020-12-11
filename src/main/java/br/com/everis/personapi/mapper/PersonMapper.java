package br.com.everis.personapi.mapper;

import br.com.everis.personapi.dto.PersonDTO;
import br.com.everis.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public abstract class PersonMapper {

    public static final PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    public abstract Person toPerson(PersonDTO personDTO);
    public abstract PersonDTO toPerson(Person person);

}
