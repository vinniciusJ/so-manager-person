package br.unioeste.esi.so_manager_person.domains.entities;

import br.unioste.esi.so_manager.address_lib.domains.entities.Address;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString
@EqualsAndHashCode(callSuper = true)
public class Client extends IndividualPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Address address;
}