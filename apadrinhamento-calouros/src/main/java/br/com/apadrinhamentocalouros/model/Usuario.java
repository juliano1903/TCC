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
public class Usuario {
	
	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq" )
	@SequenceGenerator(sequenceName = "usuario_id_seq", allocationSize = 1, name ="usuario_seq")
	public Long idUsuario;
	
	@Column(name="MATRICULA", unique=true)
	public Long matricula;

	@Column(name="EMAIL")
	public String email;

	@Column(name="NOME")
	public String nome;

	@Column(name="SENHA")
	public String senha;

	@Column(name="DATA_ACEITE", columnDefinition = "DATE")
	public Date dataAceite;

	@Column(name="DATA_NEGATIVA", columnDefinition = "DATE")
	public Date dataNegativa;
	
	@Column(name="DATA_MATRICULA", columnDefinition = "DATE")
	public Date dataMatricula;
	
	@Column(name="JUSTIFICATIVA_NEGATIVA")
	public String justificativaNegativa;
	
	@Column(name="ID_CURSO")
	public Long idCurso;
	
	@Column(name="ID_TIPO_USUARIO")
	public Long idTipoUsuario;
	
	@Column(name="KEY_CHAT_COORDENADOR")
	public String keySalaChatCoordenador;
	
	@Transient
	public boolean calouro;
	
	@Transient
	public String dsPerfil;
	
	public boolean isCalouro() {
		LocalDate dataAtual = LocalDate.now();
		calouro = DateUtils.dateToLocalDate(dataMatricula).isAfter(dataAtual.minusMonths(6));
		if(idTipoUsuario != null && idTipoUsuario == 2) {
			dsPerfil = "Coordenador";
		} else {
			dsPerfil = calouro ? "Calouro" : "Veterano";
		}
		return calouro;
	}
}
