package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Info {

    private List<DadoPessoal> dadosPessoais;
    private List<Curso> cursos;
    private List<Filme> filmes;
    private List<Viagens> viagens;
}
