package br.com.everis.personapi.dto;

import br.com.everis.personapi.entity.Phone;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.br.CPF;


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
    @CPF
    private String cpf;

    @Valid
    @NotEmpty
    private List<Phone> phoneList;

}
