package br.unioeste.esi.so_manager_person.domains.dtos;

import br.unioeste.esi.so_manager_person.domains.dtos.phone.PhoneDTO;
import br.unioeste.esi.so_manager_person.domains.entities.phone.Phone;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data @Builder
public class Person {
    private String name;
    private String socialName;

    private List<EmailDTO> emails;
    private List<PhoneDTO> phones;

    private PersonAddressDTO personAddress;
}
