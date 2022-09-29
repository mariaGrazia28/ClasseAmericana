package com.example.test.services;

import com.example.test.entities.Studente;
import com.example.test.repositories.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenteService {

    @Autowired
    StudenteRepository studenteRepository;

    public List<Studente> getStudenti(){return studenteRepository.findAll();}
    public Studente getStudente(Long id) {return studenteRepository.findById(id).get();}
    public void createStudente(Studente studente) {studenteRepository.save(studente);}
    public void removeStudente(Long id) {studenteRepository.deleteById(id);}

    public void updateStudente(Long id, Studente studente) {
        Studente tempStudente = getStudente(id);
        newStudente(studente, tempStudente);
        studenteRepository.save(tempStudente);
    }

    private Studente newStudente(Studente studenteDaController, Studente studenteDaDb){
        if(studenteDaController.getEta() != null) {
            studenteDaDb.setEta(studenteDaController.getEta());
        }
        if(studenteDaController.getNome() != null) {
            studenteDaDb.setNome(studenteDaController.getNome());
        }
        if(studenteDaController.getCognome() != null) {
            studenteDaDb.setCognome(studenteDaDb.getNome());
        }
        return studenteDaDb;
    }

}
