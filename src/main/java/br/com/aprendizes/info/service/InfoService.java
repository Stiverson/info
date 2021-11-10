package br.com.aprendizes.info.service;

import br.com.aprendizes.info.domain.provedor.Curso;
import br.com.aprendizes.info.domain.provedor.Filme;
import br.com.aprendizes.info.domain.provedor.InfoProvedor;
import br.com.aprendizes.info.domain.response.CursosResponse;
import br.com.aprendizes.info.domain.response.FilmesResponse;
import br.com.aprendizes.info.util.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoService {

    public FilmesResponse obterFilmes(Integer idPessoa) {
        List<Filme> filmesListProvedor = FilmesRepositoryMock.mockFilmesProvedorResponse();
        List<Filme> filmesListResponse = new ArrayList<>();
        for (Filme filme : filmesListProvedor) {
            if (idPessoa == filme.getIdPessoa()) {
                filmesListResponse.add(filme);
            }
        }
        return new FilmesResponse(filmesListResponse);
    }

    public CursosResponse obterCurso(Integer idPessoa) {
        List<Curso> cursosListProvedor = CursosRepositoryMock.mockCursoResponse();
        List<Curso> cursosListResponse = new ArrayList<>();
        for (Curso curso : cursosListProvedor) {
            if (idPessoa == curso.getIdPessoa()) {
                cursosListResponse.add(curso);
            }
        }
        return new CursosResponse(cursosListResponse);
    }

    public InfoProvedor obterInfo() {
        return InfoRepositoryMock.mockInfoProvedorResponse();
    }

}



