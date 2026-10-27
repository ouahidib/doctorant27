package com.ouahidi.doctorant.repositories;

import com.ouahidi.doctorant.entities.Doctorant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// pour avoir le controleur par defaut

@RepositoryRestResource
public interface DoctorantRepository extends JpaRepository<Doctorant,String> {
}
