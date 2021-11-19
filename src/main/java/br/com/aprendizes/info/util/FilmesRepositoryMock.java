package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmesRepositoryMock {

    public static List<Filme> mockFilmesProvedorResponse(){
        List<Filme> filmeList = new ArrayList<>();

        Filme duna = new Filme();
        duna.setIdPessoa(1);
        duna.setTitulo("Duna");
        duna.setDiretor("Denis Vileneve");
        duna.setDuracao("2H,28");
        duna.setData_lancamento("21/10/2021");
        duna.setElenco("Chani, Paul Atreides, Jessica Atreides, Duncan Idaho");
        duna.setStreaming("HBOMAX");

        Filme spiderverse = new Filme();
        spiderverse.setIdPessoa(1);
        spiderverse.setTitulo("Homem Aranha no Aranhaverso");
        spiderverse.setDiretor("Peter Ramsey, Rodney Rothman, Bob Persichetti");
        spiderverse.setDuracao("1H,56");
        spiderverse.setData_lancamento("10/01/2019");
        spiderverse.setElenco("Miles Morales, Homem-Aranha,Spider-Women,Gatuno, Rei do Crime,");
        spiderverse.setStreaming("Telecine");

        filmeList.add(duna);
        filmeList.add(spiderverse);

        Filme jogosvorazes = new Filme();
        jogosvorazes.setIdPessoa(2);
        jogosvorazes.setTitulo("Jogos Vorazes");
        jogosvorazes.setDiretor("Gary Ross");
        jogosvorazes.setDuracao("2H,22");
        jogosvorazes.setData_lancamento("22/03/2012");
        jogosvorazes.setElenco("Katniss Everdeen, Gale Hawthome, peeta Mellark");
        jogosvorazes.setStreaming("Netflix e Amazon Prime");

        filmeList.add(jogosvorazes);

        return  filmeList;
    }

}
