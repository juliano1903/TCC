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
	@Column(name="ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq" )
	@SequenceGenerator(sequenceName = "usuario_id_seq", allocationSize = 1, name ="usuario_seq")
	public Long idUsuario;
	
	@Column(name="MATRICULA")
	public Long matricula;

	@Column(name="EMAIL")
	public String email;

	@Column(name="NOME")
	public String nome;

	@Column(name="SENHA")
	public String senha;

	@Column(name="DATA_ACEITE")
	public LocalDate dataAceite;

	@Column(name="DATA_MATRICULA")
	public LocalDate dataMatricula;
	
	@Transient
	public boolean calouro;
	
	public boolean isCalouro() {
		LocalDate dataAtual = LocalDate.now();
		return dataMatricula.isAfter(dataAtual.minusMonths(6));
	}
}
