package br.unioeste.esi.so_manager_person.domains.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data @Builder
@EqualsAndHashCode(callSuper= true)
public class ClientDTO extends IndividualPerson {
    private Long id;
}
