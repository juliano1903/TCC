package br.com.apadrinhamentocalouros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.service.CursoService;
import br.com.apadrinhamentocalouros.service.UsuarioService;

@RestController
@RequestMapping(value = "/v1/curso")
public class CursoApiRestController {

	@Autowired
	private CursoService cursoService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Curso> findAll() {
		return cursoService.findAll();
	}
	
	@RequestMapping(value = "/id/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Curso> getById(@PathVariable Long idCurso) {
		return cursoService.findByIdCurso(idCurso);
	}

}
