package br.edu.infnet.IsaacApiJogos.model.clients;

import br.edu.infnet.IsaacApiJogos.model.domain.JogoDescricao;
import br.edu.infnet.IsaacApiJogos.model.domain.JogoId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="feighClientMMOBOMB",url="${mmobomb.url}")
public interface FeighClientMMOBOMB {

    @GetMapping("/games")
    List<JogoId> obterJogos();

    @GetMapping("/game?id={id}")
    JogoDescricao obterDescricao(@PathVariable Integer id);
}
