package br.unioeste.esi.so_manager_person.domain.entities;
import jakarta.persistence.*;
import lombok.*;

@Embeddable
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder
public class Email {
    @Column(unique = true)
    private String address;
}
