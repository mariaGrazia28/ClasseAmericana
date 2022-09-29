package com.example.test.services;

import com.example.test.entities.Docente;
import com.example.test.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    @Autowired
    DocenteRepository docenteRepository;

    public List<Docente> getDocenti(){ return docenteRepository.findAll();}
    public Docente getDocente(Long id){return docenteRepository.findById(id).get();}
    public void createDocente(Docente docente) { docenteRepository.save(docente);}
    public void removeDocente(Long id) {docenteRepository.deleteById(id);}


    public void updateDocente(Long id, Docente docente) {
        Docente tempDocente = getDocente(id);
        newDocente(docente, tempDocente);
        docenteRepository.save(tempDocente);
    }

    private Docente newDocente(Docente docenteDaController, Docente docenteDaDb) {
        if(docenteDaController.getNome() != null)
            docenteDaDb.setNome(docenteDaController.getNome());
        if(docenteDaController.getClasse() != null)
            docenteDaDb.setClasse(docenteDaController.getClasse());
        if(docenteDaController.getMateria() != null)
            docenteDaDb.setMateria(docenteDaDb.getMateria());
        return docenteDaDb;
    }

}
