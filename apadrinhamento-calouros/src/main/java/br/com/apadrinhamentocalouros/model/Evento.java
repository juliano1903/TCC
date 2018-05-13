package br.com.apadrinhamentocalouros.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evento_seq" )
	@SequenceGenerator(sequenceName = "evento_id_seq", allocationSize = 1, name ="evento_seq")
	public Long idEvento;
	
	public String nome;
	
	public Date dataEvento;
	
	public String descricao;
	
	public String local;

}
