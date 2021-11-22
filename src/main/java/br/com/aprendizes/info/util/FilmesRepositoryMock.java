package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmesRepositoryMock {

    public static List<Filme> mockFilmesProvedorResponse(){
        List<Filme> filmeList = new ArrayList<>();

        Filme truqueDeMestre = new Filme();
        truqueDeMestre.setIdPessoa(1);
        truqueDeMestre.setTitulo("truque de Mestre");
        truqueDeMestre.setDiretor("Denis Vileneve");
        truqueDeMestre.setDuracao("2H,28");
        truqueDeMestre.setData_lancamento("21/10/2021");
        truqueDeMestre.setElenco("Chani, Paul Atreides, Jessica Atreides, Duncan Idaho");
        truqueDeMestre.setStreaming("HBOMAX");

        filmeList.add(truqueDeMestre);

        Filme spiderverse = new Filme();
        spiderverse.setIdPessoa(1);
        spiderverse.setTitulo("Homem Aranha no Aranhaverso");
        spiderverse.setDiretor("Peter Ramsey, Rodney Rothman, Bob Persichetti");
        spiderverse.setDuracao("1H,56");
        spiderverse.setData_lancamento("10/01/2019");
        spiderverse.setElenco("Miles Morales, Homem-Aranha,Spider-Women,Gatuno, Rei do Crime,");
        spiderverse.setStreaming("Telecine");

        filmeList.add(spiderverse);

        Filme chappie = new Filme();
        chappie.setIdPessoa(2);
        chappie.setTitulo("Chappie");
        chappie.setDiretor("Gary Ross");
        chappie.setDuracao("2H,22");
        chappie.setData_lancamento("22/03/2012");
        chappie.setElenco("Katniss Everdeen, Gale Hawthome, peeta Mellark");
        chappie.setStreaming("Netflix e Amazon Prime");

        filmeList.add(chappie);

        return  filmeList;
    }

}
