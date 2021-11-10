package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pessoa {
    private DadoPessoal dadoPessoal;
    private boolean cineFolo;
    private boolean gamer;
    private List<Filme> filmes;
    private List<Series> series;
    private List<Viagens> viagens;
    private List<Curso> cursos;
}
