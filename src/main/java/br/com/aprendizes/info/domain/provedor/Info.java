package br.com.aprendizes.info.domain.provedor;

import lombok.Data;

import java.util.List;

@Data
public class Info {

    private List<DadoPessoal> dadosPessoais;
    private List<Curso> cursos;
    private List<Filme> filmes;
    private List<Viagens> viagens;
}
