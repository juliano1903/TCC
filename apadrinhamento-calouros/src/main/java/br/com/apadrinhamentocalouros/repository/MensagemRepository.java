package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apadrinhamentocalouros.model.Mensagem;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface MensagemRepository extends JpaRepository<Mensagem, Long>  {

}
