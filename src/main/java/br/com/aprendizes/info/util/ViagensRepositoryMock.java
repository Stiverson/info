package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.Curso;
import br.com.aprendizes.info.domain.provedor.Viagens;

import java.util.ArrayList;
import java.util.List;

public class ViagensRepositoryMock {

    public static List<Viagens> mockViagensResponse(){

        List<Viagens> viagensList = new ArrayList<>();

        Viagens viagens = new Viagens();
        viagens.setIdPessoa(1);
        viagens.setCidade("Jaguariuna");
        viagens.setLocal("Casa dos tios");
        viagens.setData("01/07/2020");
        viagensList.add(viagens);

        Viagens viagens2 = new Viagens();
        viagens.setIdPessoa(1);
        viagens2.setCidade("Fernandopolis");
        viagens2.setLocal("Casa dos tios");
        viagens2.setData("10/12/2020");
        viagensList.add(viagens2);

        Viagens viagens3 = new Viagens();
        viagens.setIdPessoa(1);
        viagens3.setCidade("Guarujá");
        viagens3.setLocal("Praia");
        viagens3.setData(" 05/01/2020");
        viagensList.add(viagens3);

        Viagens viagens4 = new Viagens();
        viagens.setIdPessoa(2);
        viagens4.setCidade("Santos");
        viagens4.setLocal("Praia");
        viagens4.setData("24/09/2021");
        viagensList.add(viagens4);

        Viagens viagens5 = new Viagens();
        viagens.setIdPessoa(2);
        viagens5.setCidade("Olimpia");
        viagens5.setLocal("");
        viagens5.setData("10/12/2017");
        viagensList.add(viagens5);

        return  viagensList;

    }
}
