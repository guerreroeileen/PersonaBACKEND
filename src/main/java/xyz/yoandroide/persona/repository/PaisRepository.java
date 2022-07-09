package xyz.yoandroide.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.yoandroide.persona.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
