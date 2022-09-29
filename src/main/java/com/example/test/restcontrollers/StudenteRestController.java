package com.example.test.restcontrollers;

import com.example.test.entities.Studente;
import com.example.test.services.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudenteRestController {

    @Autowired
    StudenteService studenteService;

    @GetMapping("/studenti")
    public List<Studente> getStudenti() {return studenteService.getStudenti();}

    @GetMapping("/studente/{id}")
    public Studente getStudente(@PathVariable Long id) {return studenteService.getStudente(id);}

    @PostMapping("/studenti")
    public void createStudente(@RequestBody Studente studente){studenteService.createStudente(studente);}

    @DeleteMapping("/studenti/{id}")
    public void deleteStudente(@PathVariable Long id){studenteService.removeStudente(id);}

    @PutMapping("/studenti/{id}")
    public void update(@PathVariable("id") long id, @RequestBody Studente studente) {studenteService.updateStudente(id, studente);}

}
