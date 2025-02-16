package br.unioeste.esi.so_manager_person.domains.entities.phone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @Builder @ToString
public class DDI {
    @Id
    private String ddd;
}
