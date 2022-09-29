package com.example.test.services;

import com.example.test.entities.Classe;
import com.example.test.repositories.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {

    @Autowired
    ClasseRepository classeRepository;

    public List<Classe> getClassi(){return classeRepository.findAll();}
    public Classe getClasse(Long id){return classeRepository.findById(id).get();}
    public void createClasse(Classe classe) throws Exception {
        List<Classe> classeLista = classeRepository.findByNome(classe.getNome());
        if(!classeLista.isEmpty()) {
            throw new Exception("La classe che si desidera inserire è già presente nel DB");
        }
        classeRepository.save(classe);
    }
    public void deleteClasse(Long id) {classeRepository.deleteById(id);}

    public void updateClasse(Long id, Classe classe) {
        Classe tempClasse = getClasse(id);
        newClasse(classe, tempClasse);
        classeRepository.save(tempClasse);
    }
    private Classe newClasse(Classe classeDaController, Classe classeDaDb) {
        if (classeDaController.getNome() != null) {
            classeDaDb.setNome(classeDaController.getNome());
        }
        if (classeDaController.getAnno() != null) {
            classeDaDb.setAnno(classeDaController.getAnno());
        }
        if (classeDaController.getStudenti() != null) {
            classeDaDb.setStudenti(classeDaController.getStudenti());
        }
        return classeDaDb;
    }

}
