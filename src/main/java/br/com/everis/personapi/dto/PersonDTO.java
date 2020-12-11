package br.com.everis.personapi.dto;

import br.com.everis.personapi.entity.Phone;
import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PersonDTO {

    @EqualsAndHashCode.Include
    private Long id;

    @Valid
    @NotEmpty
    private String firstName;

    private String lastName;

    @NotEmpty
    private String cpf;

    private List<Phone> phoneList;

}
