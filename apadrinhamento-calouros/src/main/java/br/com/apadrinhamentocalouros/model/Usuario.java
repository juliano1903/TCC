package br.com.apadrinhamentocalouros.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq" )
	@SequenceGenerator(sequenceName = "usuario_id_seq", allocationSize = 1, name ="usuario_seq")
	public Long idUsuario;
	
	public Long matricula;
	
	public String email;
	
	public String nome;
	
	public String senha;
	
	public Date dataAceite;
}
