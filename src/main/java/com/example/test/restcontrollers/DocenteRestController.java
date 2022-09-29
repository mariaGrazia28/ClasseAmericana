package com.example.test.restcontrollers;

import com.example.test.entities.Docente;
import com.example.test.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocenteRestController {

    @Autowired
    DocenteService docenteService;

    @GetMapping("/docenti")
    public List<Docente> getDocenti(){return docenteService.getDocenti();}

    @GetMapping("/docente/{id}")
    public Docente getDocente(@PathVariable Long id){return docenteService.getDocente(id);}

    @PostMapping("/docenti")
    public void createDocente(@RequestBody Docente docente){docenteService.createDocente(docente);}

    @DeleteMapping("/docenti/{id}")
    public void deleteDocente(@PathVariable Long id){docenteService.removeDocente(id);}

    @PutMapping("/docenti/{id}")
    public void update(@PathVariable Long id, @RequestBody Docente docente){docenteService.updateDocente(id, docente);}

}
