package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositoryMock {

    public static List<Pessoa> mockPessoaResponse(){

        List<Pessoa> pessoaList = new ArrayList<>();

        Pessoa mikael = new Pessoa();
        mikael.setNomePessoa("Mikael");
        mikael.setIdade(18);
        mikael.setCinefolo(true);
        mikael.setGamer(true);
        pessoaList.add(mikael);

        Pessoa gabi = new Pessoa();
        gabi.setNomePessoa("Gabriela");
        gabi.setIdade(17);
        gabi.setCinefolo(true);
        gabi.setGamer(false);
        pessoaList.add(gabi);


        return pessoaList;
    }

}
