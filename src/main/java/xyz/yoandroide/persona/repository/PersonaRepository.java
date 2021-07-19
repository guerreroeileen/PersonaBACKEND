package xyz.yoandroide.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.yoandroide.persona.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
