package br.edu.infnet.IsaacApiJogos.controller;

import br.edu.infnet.IsaacApiJogos.model.clients.FeighClientMMOBOMB;
import br.edu.infnet.IsaacApiJogos.model.domain.JogoDescricao;
import br.edu.infnet.IsaacApiJogos.model.service.JogoDescricaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/descricao")
public class JogoDescricaoController {

    private final JogoDescricaoService jogoDescricaoService;

    JogoDescricaoController(FeighClientMMOBOMB feighClientMMOBOMB){
        jogoDescricaoService = new JogoDescricaoService(feighClientMMOBOMB);
    }


    @GetMapping("/jogo/{jogoNome}")
    public ResponseEntity<Object> obterDescricao(@PathVariable String jogoNome){

        try {
            JogoDescricao jogo = jogoDescricaoService.obterDescricao(jogoNome);
            return new ResponseEntity<>(jogo, HttpStatus.OK);
        }
        catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}
