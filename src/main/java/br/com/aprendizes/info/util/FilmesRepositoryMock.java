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
        duna.setElenco("");
        duna.setStreaming("HBOMAX");

        Filme spiderverse = new Filme();
        spiderverse.setIdPessoa(1);
        spiderverse.setTitulo("Homem Aranha no Aranha verso");
        spiderverse.setDiretor("");
        spiderverse.setDuracao("");
        spiderverse.setData_lancamento("");
        spiderverse.setElenco("");
        spiderverse.setStreaming("Netflix");

        filmeList.add(duna);
        filmeList.add(spiderverse);

        Filme jogosvorazes = new Filme();
        jogosvorazes.setIdPessoa(2);
        jogosvorazes.setTitulo("Jogos Vorazes");
        jogosvorazes.setDiretor("Gary Ross");
        jogosvorazes.setDuracao("2H,22");
        jogosvorazes.setData_lancamento("22/03/2012");
        jogosvorazes.setElenco(" Jennifer Lawrence; Josh Hutcherson; Liam Hemsworth");
        jogosvorazes.setStreaming("Netflix e Amazon Prime");

        Filme alerta_vermelho = new Filme();
        alerta_vermelho.setIdPessoa(2);
        alerta_vermelho.setTitulo("Alerta Vermelho");
        alerta_vermelho.setDiretor("Rawson Marshall Thurber");
        alerta_vermelho.setDuracao("1h,55");
        alerta_vermelho.setData_lancamento("12/11/2021");
        alerta_vermelho.setElenco("Gal Gadot, Dwayne Johnson, Ryan Renolds");
        alerta_vermelho.setStreaming("Netflix e Amazon Prime");

        filmeList.add(jogosvorazes);
        filmeList.add(alerta_vermelho);


        return  filmeList;
    }

}
