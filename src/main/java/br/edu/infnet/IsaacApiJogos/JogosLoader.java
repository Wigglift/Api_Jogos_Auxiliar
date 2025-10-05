package br.edu.infnet.IsaacApiJogos;

import br.edu.infnet.IsaacApiJogos.model.clients.FeighClientMMOBOMB;
import br.edu.infnet.IsaacApiJogos.model.domain.JogoDescricao;
import br.edu.infnet.IsaacApiJogos.model.domain.JogoId;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JogosLoader implements ApplicationRunner {

    private final FeighClientMMOBOMB feighClientMMOBOMB;

    JogosLoader(FeighClientMMOBOMB feighClientMMOBOMB){
        this.feighClientMMOBOMB = feighClientMMOBOMB;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<JogoId> lista = feighClientMMOBOMB.obterJogos();
        for(JogoId jogo : lista){
            System.out.println(jogo.getId());
            System.out.println(jogo.getTitle());
        }

        JogoDescricao jogo = feighClientMMOBOMB.obterDescricao(321);
        System.out.println(jogo.getTitle());
        System.out.println(jogo.getDescription());
    }
}
