package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apadrinhamentocalouros.model.Encontro;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface EncontroRepository extends JpaRepository<Encontro, Long>  {

}
