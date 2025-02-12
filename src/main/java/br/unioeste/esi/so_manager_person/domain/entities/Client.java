package br.unioeste.esi.so_manager_person.domain.entities;

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
}