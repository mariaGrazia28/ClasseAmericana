package com.example.test.repositories;

import com.example.test.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente, Long>  {
}
