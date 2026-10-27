package com.ouahidi.doctorant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.boot.beanvalidation.IntegrationException;

@Entity
@Getter @Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Doctorant {
    @Id
    private String id;
    private String name;
    private String surname;
    private Integer age;
    private String email;
}
