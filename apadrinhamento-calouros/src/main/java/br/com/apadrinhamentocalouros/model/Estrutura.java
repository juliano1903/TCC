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
public class Estrutura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estrutura_seq" )
	@SequenceGenerator(sequenceName = "estrutura_id_seq", allocationSize = 1, name ="estrutura_seq")
	public Long idEstrutura;
	
	public String nome;
	
	public String descricao;
	
	public String local;
}
