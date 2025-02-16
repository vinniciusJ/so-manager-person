package br.unioeste.esi.so_manager_person.domains.entities.phone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class DDD {
    @Id
    private String ddd;
}
