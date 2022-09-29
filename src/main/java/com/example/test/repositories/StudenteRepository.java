package com.example.test.repositories;

import com.example.test.entities.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudenteRepository extends JpaRepository<Studente, Long> {
    List<Studente> findByNomeAndCognome(String nome, String cognome);

}





