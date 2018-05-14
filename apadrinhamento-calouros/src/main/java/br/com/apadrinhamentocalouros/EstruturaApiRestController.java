package br.com.apadrinhamentocalouros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Estrutura;
import br.com.apadrinhamentocalouros.model.Evento;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.service.CursoService;
import br.com.apadrinhamentocalouros.service.EstruturaService;
import br.com.apadrinhamentocalouros.service.EventoService;
import br.com.apadrinhamentocalouros.service.UsuarioService;

@RestController
@RequestMapping(value = "/v1/estrutura")
public class EstruturaApiRestController {

	@Autowired
	private EstruturaService estruturaService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Estrutura> findAll() {
		return estruturaService.findAll();
	}
}
