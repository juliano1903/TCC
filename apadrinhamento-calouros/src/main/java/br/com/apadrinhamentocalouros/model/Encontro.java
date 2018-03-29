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
public class Encontro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "encontro_seq" )
	@SequenceGenerator(sequenceName = "encontro_id_seq", allocationSize = 1, name ="encontro_seq")
	public Long idEncontro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario", insertable=false, updatable=false)
	public Usuario usuarioVeterano;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario", insertable=false, updatable=false)
	public Usuario usuarioCalouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario", insertable=false, updatable=false)
	public Usuario usuarioCoordenador;
	
	public Date data;
	
}