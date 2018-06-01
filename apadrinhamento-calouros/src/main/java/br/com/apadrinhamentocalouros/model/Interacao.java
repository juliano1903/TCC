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
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Interacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "interacao_seq" )
	@SequenceGenerator(sequenceName = "interacao_id_seq", allocationSize = 1, name ="interacao_seq")
	public Long idInteracao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario_veterano")
	public Usuario usuarioVeterano;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario_calouro")
	public Usuario usuarioCalouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario_coordenador")
	public Usuario usuarioCoordenador;
	
	public Date data;
	
	public String titulo;
	
	public String descricao;
	
	@Transient
	public boolean coordenador;
	
}