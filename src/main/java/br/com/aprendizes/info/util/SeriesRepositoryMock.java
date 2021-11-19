package br.com.aprendizes.info.util;


import br.com.aprendizes.info.domain.provedor.Series;

import java.util.ArrayList;
import java.util.List;

public class SeriesRepositoryMock {

    public static List<Series> mockSeriesProvedorResonce(){
        List<Series> seriesList = new ArrayList<>();

        Series prisonBreak = new Series();
        prisonBreak.setIdPessoa(1);
        prisonBreak.setTitulo("Prison Break");
        prisonBreak.setDiretor("Paul Scheuring");
        prisonBreak.setPrimeiroEpisodio("29/08/2005");
        prisonBreak.setUltimoEpisodio("30/05/2017");
        prisonBreak.setElenco("Wentworth Miller, Dominic Purcell, Sarah Wayne Callies");
        prisonBreak.setStreaming("Fox Broadcasting Company");

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

        Series blindspot = new Series();
        blindspot.setIdPessoa(2);
        blindspot.setTitulo("Blindspot");
        blindspot.setDiretor("Martin Gero, Brendan Gall");
        blindspot.setPrimeiroEpisodio("21/09/2015");
        blindspot.setUltimoEpisodio("23/07/2020");
        blindspot.setElenco("Jaimie Alexander, Sullivan Stapleton, Rob Brown, Audrey Esparza, Ashley Johnson, Ennis Esmer'");
        blindspot.setStreaming("National Broadcasting Company");


        seriesList.add(blindspot);

        Series pll = new Series();
        pll.setIdPessoa(2);
        pll.setTitulo("Pretty Little Liars");
        pll.setDiretor("I. Marlene King");
        pll.setPrimeiroEpisodio("06/06/2010");
        pll.setUltimoEpisodio("21/06/2016");
        pll.setElenco("Troian Bellisario, Lucy Hale, Ashley Benson, Shay Mitchell");
        pll.setStreaming("Freeform");
        pll.setOpiniao(true);

        return seriesList;
    }

}
