package com.example.test.repositories;

import com.example.test.entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

    List<Classe> findByNome(String nome);



}
