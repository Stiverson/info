package br.com.aprendizes.info.util;


import br.com.aprendizes.info.domain.provedor.Series;

import java.util.ArrayList;
import java.util.List;

public class SeriesRepositoryMock {

    public static List<Series> mockSeriesProvedorResonce(){
        List<Series> seriesList = new ArrayList<>();

        Series prisonBreak = new Series();
        prisonBreak.setIdPessoa(1);
        prisonBreak.setTitulo("");
        prisonBreak.setDiretor("");
        prisonBreak.setPrimeiroEpisodio("");
        prisonBreak.setUltimoEpisodio("11/12");
        prisonBreak.setElenco("Ela");
        prisonBreak.setStreaming("Netflix");

        seriesList.add(prisonBreak);

        Series goodGirls = new Series();
        goodGirls.setIdPessoa(2);
        goodGirls.setTitulo("Good Girls");
        goodGirls.setDiretor("Jenna Bans");
        goodGirls.setPrimeiroEpisodio("24/02/2018");
        goodGirls.setUltimoEpisodio("22/07/2021");
        goodGirls.setElenco("Christina Hendricks, Retta, Mae Whitman, Manny Montana, Reno Wilson, Matthew Lillard");
        goodGirls.setStreaming("NBC");

        seriesList.add(goodGirls);


        return seriesList;
    }

}
