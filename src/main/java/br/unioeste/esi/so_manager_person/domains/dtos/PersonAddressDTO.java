package br.unioeste.esi.so_manager_person.domains.dtos;

import br.unioste.esi.so_manager.address_lib.domains.dtos.AddressDTO;
import lombok.Builder;
import lombok.Data;

@Data @Builder
public class PersonAddressDTO {
    private String addressNumber;
    private String addressComplement;
    private AddressDTO address;
}
