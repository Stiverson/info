package br.com.aprendizes.info.domain.provedor;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pessoa {
    private DadoPessoal dadoPessoal;
    private boolean cineFolo;
    private boolean gamer;
    private List<Filme> filmes = new ArrayList<>();
    private List<Series> series = new ArrayList<>();
    private List<Viagens> viagens = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
}
