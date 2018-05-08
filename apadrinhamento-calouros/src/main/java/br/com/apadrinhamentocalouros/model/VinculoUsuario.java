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
public class VinculoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vinculo_usuario_seq" )
	@SequenceGenerator(sequenceName = "vinculo_usuario_id_seq", allocationSize = 1, name ="vinculo_usuario_seq")
	public Long idVinculoUsuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario_calouro")
	public Usuario usuarioCalouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario_veterano")
	public Usuario usuarioVeterano;
	
	public Date dataVinculacao;
	
	private Date dataDesvinculacao;
	
	private String motivoDesvinculacao;
	
}
