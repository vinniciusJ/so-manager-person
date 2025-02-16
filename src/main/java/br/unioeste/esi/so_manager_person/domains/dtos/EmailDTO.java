package br.unioeste.esi.so_manager_person.domains.dtos;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class EmailDTO {
    private Long id;
    private String address;
}
