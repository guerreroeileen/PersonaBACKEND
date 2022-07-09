package xyz.yoandroide.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import xyz.yoandroide.persona.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
