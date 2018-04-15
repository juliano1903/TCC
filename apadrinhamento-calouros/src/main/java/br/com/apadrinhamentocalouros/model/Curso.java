package br.com.apadrinhamentocalouros.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

import br.com.apadrinhamentocalouros.utils.DateUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {
	
	@Id
	@Column(name="ID_CURSO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_seq" )
	@SequenceGenerator(sequenceName = "curso_id_seq", allocationSize = 1, name ="curso_seq")
	public Long idCurso;
	
	@Column(name="NOME")
	public String nome;
}
