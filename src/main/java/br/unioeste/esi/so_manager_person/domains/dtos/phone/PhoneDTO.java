package br.unioeste.esi.so_manager_person.domains.dtos.phone;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class PhoneDTO {
    private Long id;
    private String number;
    private DDDDTO ddd;
    private DDIDTO ddi;
}
