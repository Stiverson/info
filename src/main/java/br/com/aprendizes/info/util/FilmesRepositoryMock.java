package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.Filmes;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class FilmesRepositoryMock {

    public static List<Filmes> mockFilmesProvedorResponse(){
        List<Filmes> filmeList = new ArrayList<>();

        Filmes duna = new Filmes();
        duna.setIdPessoa(1);
        duna.setTitulo("Duna");
        duna.setDiretor("Denis Vileneve");
        duna.setDuracao("2H,28");
        duna.setData_lancamento("21/10/2021");
        duna.setElenco("");
        duna.setStreaming("HBOMAX");

        Filmes spiderverse = new Filmes();
        spiderverse.setIdPessoa(1);
        spiderverse.setTitulo("Homem Aranha no Aranha verso");
        spiderverse.setDiretor("");
        spiderverse.setDuracao("");
        spiderverse.setData_lancamento("");
        spiderverse.setElenco("");
        spiderverse.setStreaming("Netflix");

        filmeList.add(duna);
        filmeList.add(spiderverse);

        Filmes jogosvorazes = new Filmes();
        jogosvorazes.setIdPessoa(2);
        jogosvorazes.setTitulo("Jogos Vorazes");
        jogosvorazes.setDiretor("Gary Ross");
        jogosvorazes.setDuracao("2H,22");
        jogosvorazes.setData_lancamento("22/03/2012");
        jogosvorazes.setElenco("");
        jogosvorazes.setStreaming("Netflix e Amazon Prime");

        filmeList.add(jogosvorazes);

        return  filmeList;
    }

}
