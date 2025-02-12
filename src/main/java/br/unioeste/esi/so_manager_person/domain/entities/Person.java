package br.unioeste.esi.so_manager_person.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Data @ToString
@Builder
public class Person {
    private String name;

    private String socialName;

    @ElementCollection
    @CollectionTable
    private List<Email> emails;

    @ElementCollection
    @CollectionTable
    private List<String> phones;
}

