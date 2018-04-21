package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.model.VinculoUsuario;

public interface VinculoUsuarioRepository extends JpaRepository<VinculoUsuario, Long>  {

}
