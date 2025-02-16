package br.unioeste.esi.so_manager_person.domains.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Builder
@EqualsAndHashCode(callSuper = true)
public class IndividualPerson extends Person{
    private String firstName;
    private String middleName;
    private String lastName;


}
