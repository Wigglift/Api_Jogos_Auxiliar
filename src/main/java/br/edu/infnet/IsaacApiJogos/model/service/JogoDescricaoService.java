package br.edu.infnet.IsaacApiJogos.model.service;

import br.edu.infnet.IsaacApiJogos.model.clients.FeighClientMMOBOMB;
import br.edu.infnet.IsaacApiJogos.model.domain.JogoDescricao;
import br.edu.infnet.IsaacApiJogos.model.domain.JogoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ldap.HasControls;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JogoDescricaoService {

    private final FeighClientMMOBOMB feighClientMMOBOMB;

    Map<String, Integer> listaJogos = new HashMap<String, Integer>();

    public JogoDescricaoService(FeighClientMMOBOMB feighClientMMOBOMB){

        this.feighClientMMOBOMB = feighClientMMOBOMB;

        List<JogoId> tempList = feighClientMMOBOMB.obterJogos();

        for(JogoId jogo : tempList){
            this.listaJogos.put(jogo.getTitle(),jogo.getId());
        }
    }

    public JogoDescricao obterDescricao(String jogoNome){

        String jogoNomeUsavel = jogoNome.replace("$","");

        Integer id = listaJogos.get(jogoNomeUsavel);

        JogoDescricao jogoDescricao = feighClientMMOBOMB.obterDescricao(id);

        return jogoDescricao;
    }
}
