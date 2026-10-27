package com.ouahidi.doctorant;

import com.ouahidi.doctorant.entities.Doctorant;
import com.ouahidi.doctorant.repositories.DoctorantRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class DoctorantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorantsApplication.class, args);
    }

    @Bean
    CommandLineRunner  start(DoctorantRepository     doctorantRepository)
        {
        return args -> {
            Doctorant d1 = Doctorant.builder()
                    .name("D1")
                    .age(23)
                    .surname("S1")
                    .email("s1.d1@gmail.com")
                    .id(UUID.randomUUID().toString())
                    .build();
            doctorantRepository.save(d1);

            Doctorant d2 = Doctorant.builder()
                    .name("D2")
                    .age(23)
                    .surname("S2")
                    .email("s2.d2@gmail.com")
                    .id(UUID.randomUUID().toString())
                    .build();
            doctorantRepository.save(d2);

            List<Doctorant> doctorants = doctorantRepository.findAll();

            for (Doctorant d : doctorants) {
                System.out.println(d);

            }


        };

        }

}
