package com.ouahidi.doctorant.Controleur;

import com.ouahidi.doctorant.entities.Doctorant;
import com.ouahidi.doctorant.repositories.DoctorantRepository;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

// On ajoute /api
@RestController
// par defaut htt://localhost:7070/etudiants
@RequestMapping("/api")

public class EtudiantControler {
    public EtudiantControler(DoctorantRepository doctorantRepository) {
        this.doctorantRepository = doctorantRepository;
    }
    DoctorantRepository doctorantRepository;

    @GetMapping("/doctorants")
    public List<Doctorant> findAllDoctorants() {
        return doctorantRepository.findAll();
    }

    @GetMapping("/doctorants/{id}")
        public Doctorant findDoctorantById(@PathVariable String id) {
        return doctorantRepository.findById(id).get();
        }



        @PostMapping("/doctorants")
    public void  saveDoctorant(@RequestBody Doctorant doctorant) {
        doctorantRepository.save(doctorant);
     }

     @PutMapping("/doctorants/{id}")
    public void  updateDoctorant(@PathVariable String id, @RequestBody Doctorant doctorant) {

        doctorant.setId(id);
        doctorantRepository.save(doctorant);

     }
  @DeleteMapping("/doctorants/{id}")
    public void deleteDoctorant(@PathVariable String  id) {

        doctorantRepository.deleteById(id);



  }
}
