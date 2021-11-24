package br.com.aprendizes.info.util;


import br.com.aprendizes.info.domain.provedor.DadoPessoal;

import java.util.ArrayList;
import java.util.List;

public class DadosPessoalRepositoryMock {

    public static List<DadoPessoal> mockDadoPessoalResponse() {
        List<DadoPessoal> dadoPessoalList = new ArrayList<>();
        DadoPessoal dadosPessoal = new DadoPessoal();
        dadosPessoal.setIdPessoa(1);
        dadosPessoal.setNome("Mikael Santos Lima");
        dadosPessoal.setIdade(17);
        dadosPessoal.setNacionalidade("Brasileiro");
        dadosPessoal.setEstadoCivil("Solteiro");
        dadosPessoal.setDataNascimento("13/12/2003");
        dadosPessoal.setEndereco("Bairro Jardim Eulina, Campinas, SP");
        dadosPessoal.setTelefone("(19) 99595-5917");
        dadosPessoal.setEmail("mikaelsl@ciandt.com");
        dadosPessoal.setNomeEscola("E.E.Profº Hildebrando Siqueira");
        dadosPessoal.setEscolaridade("Ensino Medio-3ºAno(cursando)");


        DadoPessoal dadosPessoal2 = new DadoPessoal();
        dadosPessoal2.setIdPessoa(2);
        dadosPessoal2.setNome("Gabriela Manoeli Tavares da Silva");
        dadosPessoal2.setIdade(17);
        dadosPessoal2.setNacionalidade("Brasileiro");
        dadosPessoal2.setEstadoCivil("Solteira");
        dadosPessoal2.setDataNascimento("06/10/2004");
        dadosPessoal2.setEndereco("Bairro Parque da Floresta, Campinas, SP");
        dadosPessoal2.setTelefone("(19) 98983-7900");
        dadosPessoal2.setEmail("gabrielamt@ciandt.com");
        dadosPessoal2.setNomeEscola("E.E.Hugo Penteado Teixeira");
        dadosPessoal2.setEscolaridade("Ensino Medio-2ºAno(cursando)");

        dadoPessoalList.add(dadosPessoal);
        dadoPessoalList.add(dadosPessoal2);

        return  dadoPessoalList;

    }

}
