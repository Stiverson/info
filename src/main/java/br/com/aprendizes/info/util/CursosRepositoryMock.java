package br.com.aprendizes.info.util;

import br.com.aprendizes.info.domain.provedor.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursosRepositoryMock {

    public static List<Curso> mockCursoResponse(){

        List<Curso> cursoList = new ArrayList<>();

        Curso curso = new Curso();
        curso.setNomeDoAluno("Mikael");
        curso.setTitulo("HTML & CSS3");
        curso.setInstituicao("ALura");

        cursoList.add(curso);

        Curso curso2 = new Curso();
        curso2.setNomeDoAluno("Mikael");
        curso2.setTitulo("PYTHON");
        curso2.setInstituicao("TECHCAMPUS");

        cursoList.add(curso2);

        Curso curso3 = new Curso();
        curso3.setNomeDoAluno("Mikael");
        curso3.setTitulo("Git e GitHub");
        curso3.setInstituicao("Udemy");

        cursoList.add(curso3);

        Curso curso4 = new Curso();
        curso4.setNomeDoAluno("Gabriela");
        curso4.setTitulo("HTML & CSS3");
        curso4.setInstituicao("ALura");

        cursoList.add(curso4);

        Curso curso5 = new Curso();
        curso5.setNomeDoAluno("Gabriela");
        curso5.setTitulo("PYTHON");
        curso5.setInstituicao("TECHCAMPUS");

        cursoList.add(curso5);

        Curso curso6 = new Curso();
        curso6.setNomeDoAluno("Gabriela");
        curso6.setTitulo("Git e GitHub");
        curso6.setInstituicao("Udemy");

        cursoList.add(curso6);


        return cursoList;
    }

}
