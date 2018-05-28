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
public class Avaliacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "avaliacao_seq" )
	@SequenceGenerator(sequenceName = "avaliacao_id_seq", allocationSize = 1, name ="avaliacao_seq")
	public Long idAvaliacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	public Usuario usuario;
	
	public Date dataAvaliacao;
	
	public String observacao;
	
	public Long avaliacao;

}
