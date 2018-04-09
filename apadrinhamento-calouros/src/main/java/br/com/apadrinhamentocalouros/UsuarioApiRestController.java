package br.com.apadrinhamentocalouros;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.service.UsuarioService;

@RestController
@RequestMapping(value = "/v1/usuario")
public class UsuarioApiRestController {
	
	@Autowired
	private UsuarioService usuarioService;
	
  @RequestMapping(value = "/pendentes-aceite", method = RequestMethod.GET, produces = "application/json")
  public Iterable<Usuario> findUsuariosPendentesDeAceite() {
	  return usuarioService.findUsuariosPendentesDeAceite();
  }
  
  @RequestMapping(value = "/salva", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
  public Usuario salvaUsuario(@RequestBody Usuario usuario) {
	  return usuarioService.save(usuario);
  }
  
  @RequestMapping(value = "/aprova-cadastro", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
  public Usuario aprovaCadastro(@RequestBody Usuario usuario) {
	  return usuarioService.validarCadastro(usuario);
  }
	
	
//	@Autowired
//	private LanceService lanceService;
//	
//	@Autowired
//	private LeilaoService leilaoService;
//
//    @RequestMapping(value = "lance/{idLeilao}", method = RequestMethod.GET, produces = "application/json")
//    public List<Lance> getLances(@PathVariable Long idLeilao) {
//    	Iterable<Lance> lances = lanceService.findByIdLeilao(new Leilao().builder().idLeilao(idLeilao).build());
//    	List<Lance> retorno = new ArrayList<Lance>();
//    	for (Lance lance : lances) {
//        	retorno.add(new Lance().builder().valorString(lance.getValorString()).dataHora(lance.getDataHora()).build());    		
//    	}
// 
//    	return retorno;
//    }
//    
//    @RequestMapping(value = "leilao/informacoes/{idLeilao}", method = RequestMethod.GET, produces = "application/json")
//    public Leilao getInformacoes(@PathVariable Long idLeilao) {
//    	
//    	Leilao leilao = leilaoService.findByIdLeilao(idLeilao);
//    	leilao.setFinalizado(leilaoService.isFinalizado(leilao));
//    	
//    	Lance lanceVencedor = lanceService.findLanceVencedor(leilao);
//    			
//    	return new Leilao().builder()
//    			.dataFim(leilao.getDataFim())
//    			.dataInicio(leilao.getDataInicio())
//    			.lanceVencedor(lanceVencedor != null ? lanceVencedor.getValorString() : "")
//    			.naturezaLeilao(leilao.getNaturezaLeilao())
//    			.valorString(leilao.isFinalizado() || leilao.getTipoLance().idTipoLance == 2 ? leilao.getValorString() : "")
//    			.build();
//    }
}
