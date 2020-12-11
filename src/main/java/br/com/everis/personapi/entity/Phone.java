package br.com.everis.personapi.entity;

import br.com.everis.personapi.enums.PhoneType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Phone {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private PhoneType type;

    @Column(nullable = false, length = 20)
    private String number;

    @ManyToOne
    private Person person;
}
