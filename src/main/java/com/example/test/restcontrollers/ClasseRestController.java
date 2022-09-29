package com.example.test.restcontrollers;

import com.example.test.entities.Classe;
import com.example.test.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/classi")
public class ClasseRestController {
    
    @Autowired
    ClasseService classeService;
    
    @GetMapping
    public List<Classe> getClassi(){return classeService.getClassi();}

    @GetMapping("/{id}")
    public Classe getClasse(@PathVariable Long id){return classeService.getClasse(id);}

    @PostMapping
    public void createClasse(@RequestBody Classe classe) throws Exception {classeService.createClasse(classe);}

    @DeleteMapping("/{id}")
    public void deleteClasse(@PathVariable Long id){ classeService.deleteClasse(id);}

    @PutMapping("/{id}")
    public void updateClasse(@PathVariable Long id, @RequestBody Classe classe){classeService.updateClasse(id, classe);}
    
}
