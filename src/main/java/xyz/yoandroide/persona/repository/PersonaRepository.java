package xyz.yoandroide.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.yoandroide.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
