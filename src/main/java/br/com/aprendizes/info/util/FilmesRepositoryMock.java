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
        truqueDeMestre.setDiretor("Louis Leterrier");
        truqueDeMestre.setDuracao("1H,55");
        truqueDeMestre.setData_lancamento("05/07/2013");
        truqueDeMestre.setElenco("Jesse Eisemberg(Atlas), Woody Harrelson(McKinny), Dave Franco(Jack), Isla fisher(Harley)");
        truqueDeMestre.setStreaming("Netflix");

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
        chappie.setIdPessoa(1);
        chappie.setTitulo("Chappie");
        chappie.setDiretor("Neill Blomkamp");
        chappie.setDuracao("2H,00");
        chappie.setData_lancamento("16/04/2015");
        chappie.setElenco("Hugh Jackman(Vicent), Dev Patel(Deon), Sharlto Copley(Chappie)");
        chappie.setStreaming("Netflix");

        filmeList.add(chappie);

        return  filmeList;
    }

}
