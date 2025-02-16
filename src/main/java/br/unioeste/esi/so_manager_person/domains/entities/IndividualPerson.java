package br.unioeste.esi.so_manager_person.domains.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@MappedSuperclass
@Data @ToString
@EqualsAndHashCode(callSuper = true)
public class IndividualPerson extends Person {
    private String firstName;
    private String middleName;

    private String cpf;
}
