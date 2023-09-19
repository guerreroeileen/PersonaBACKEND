package xyz.yoandroide.persona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


import java.io.Serializable;

@Entity
@Data
@Table(name = "persona")
public class Persona implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;
	
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;
	@ManyToOne
	@JoinColumn (name="id_estado")
	private Estado estado;
}
