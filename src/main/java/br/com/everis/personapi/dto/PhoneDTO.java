package br.com.everis.personapi.dto;

import br.com.everis.personapi.entity.Person;
import br.com.everis.personapi.enums.PhoneType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PhoneDTO {

    @EqualsAndHashCode.Include
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    private String number;

    private Person person;
}
