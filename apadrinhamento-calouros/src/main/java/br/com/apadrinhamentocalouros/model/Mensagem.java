package br.com.apadrinhamentocalouros.model;

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
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mensagem_seq" )
	@SequenceGenerator(sequenceName = "mensagem_id_seq", allocationSize = 1, name ="mensagem_seq")
	public Long idMensagem;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario", insertable=false, updatable=false)
	public Usuario usuarioRemetente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_usuario", insertable=false, updatable=false)
	public Usuario usuarioDestinatario;
	
//	public Data data;
	
	public String observacao;
	
}
