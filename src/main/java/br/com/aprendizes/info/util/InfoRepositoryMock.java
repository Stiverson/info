package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.*;

import java.util.ArrayList;
import java.util.List;

public class InfoRepositoryMock {

    public static InfoProvedor mockInfoProvedorResponse(){
        List<Pessoa> pessoaList = new ArrayList<>();
        Pessoa pessoa = new Pessoa();

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
        dadosPessoal.setNomeEscola("E.E.Profº Miguel Vicente Cury");
        dadosPessoal.setEscolaridade("Ensino Medio-3ºAno(cursando)");

        pessoa.setDadoPessoal(dadosPessoal);
        pessoa.setCineFolo(true);
        pessoa.setGamer(true);

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

        pessoa.setFilmes(filmeList);

        List<Viagens> viagensList = new ArrayList<>();

        Viagens viagens = new Viagens();
        viagens.setIdPessoa(1);
        viagens.setCidade("Jaguariuna");
        viagens.setLocal("Casa dos tios");
        viagens.setData("01/07/2020");
        viagensList.add(viagens);

        Viagens viagens2 = new Viagens();
        viagens2.setIdPessoa(1);
        viagens2.setCidade("Fernandopolis");
        viagens2.setLocal("Casa dos tios");
        viagens2.setData("10/12/2020");
        viagensList.add(viagens2);

        Viagens viagens3 = new Viagens();
        viagens3.setIdPessoa(1);
        viagens3.setCidade("Guarujá");
        viagens3.setLocal("Praia");
        viagens3.setData(" 05/01/2020");
        viagensList.add(viagens3);

        pessoa.setViagens(viagensList);

        List<Curso> cursoList = new ArrayList<>();

        Curso curso = new Curso();
        curso.setIdPessoa(1);
        curso.setTitulo("HTML & CSS3");
        curso.setInstituicao("ALura");


        Curso curso2 = new Curso();
        curso2.setIdPessoa(1);
        curso2.setTitulo("PYTHON");
        curso2.setInstituicao("TECHCAMPUS");


        Curso curso3 = new Curso();
        curso3.setIdPessoa(1);
        curso3.setTitulo("Git e GitHub");
        curso3.setInstituicao("Udemy");

        cursoList.add(curso);
        cursoList.add(curso2);
        cursoList.add(curso3);

        pessoa.setCursos(cursoList);

        Pessoa pessoa2 = new Pessoa();

        DadoPessoal dadosPessoal2 = new DadoPessoal();
        dadosPessoal2.setIdPessoa(2);
        dadosPessoal2.setNome("Gabriela Manoeli Tavares da Silva");
        dadosPessoal2.setIdade(16);
        dadosPessoal2.setNacionalidade("Brasileiro");
        dadosPessoal2.setEstadoCivil("Solteira");
        dadosPessoal2.setDataNascimento("06/10/2004");
        dadosPessoal2.setEndereco("Bairro Parque da Floresta, Campinas, SP");
        dadosPessoal2.setTelefone("(19) 98983-7900");
        dadosPessoal2.setEmail("gabrielamt@ciandt.com");
        dadosPessoal2.setNomeEscola("E.E.Hugo Penteado Teixeira");
        dadosPessoal2.setEscolaridade("Ensino Medio-2ºAno(cursando)");

        pessoa2.setDadoPessoal(dadosPessoal2);
        pessoa2.setCineFolo(true);
        pessoa2.setGamer(false);

        List<Filme> filmes = new ArrayList<>();
        Filme jogosvorazes = new Filme();
        jogosvorazes.setIdPessoa(2);
        jogosvorazes.setTitulo("Jogos Vorazes");
        jogosvorazes.setDiretor("Gary Ross");
        jogosvorazes.setDuracao("2H,22");
        jogosvorazes.setData_lancamento("22/03/2012");
        jogosvorazes.setElenco("");
        jogosvorazes.setStreaming("Netflix e Amazon Prime");

        filmes.add(jogosvorazes);
        pessoa2.setFilmes(filmes);

        List<Viagens> viagensList2 = new ArrayList<>();

        Viagens viagens4 = new Viagens();
        viagens4.setIdPessoa(2);
        viagens4.setCidade("Santos");
        viagens4.setLocal("Praia");
        viagens4.setData("24/09/2021");
        viagensList2.add(viagens4);

        Viagens viagens5 = new Viagens();
        viagens5.setIdPessoa(2);
        viagens5.setCidade("Olimpia");
        viagens5.setLocal("");
        viagens5.setData("10/12/2017");
        viagensList2.add(viagens5);

        pessoa2.setViagens(viagensList2);

        List<Curso> cursoList2 = new ArrayList<>();
        Curso curso4 = new Curso();
        curso4.setIdPessoa(2);
        curso4.setTitulo("HTML & CSS3");
        curso4.setInstituicao("ALura");

        cursoList2.add(curso4);

        Curso curso5 = new Curso();
        curso5.setIdPessoa(2);
        curso5.setTitulo("PYTHON");
        curso5.setInstituicao("TECHCAMPUS");

        cursoList2.add(curso5);

        Curso curso6 = new Curso();
        curso6.setIdPessoa(2);
        curso6.setTitulo("Git e GitHub");
        curso6.setInstituicao("Udemy");

        cursoList2.add(curso6);
        pessoa2.setCursos(cursoList2);

        pessoaList.add(pessoa);
        pessoaList.add(pessoa2);

        return new InfoProvedor(pessoaList);
    }

}
