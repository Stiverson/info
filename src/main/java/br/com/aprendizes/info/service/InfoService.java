package br.com.aprendizes.info.service;

import br.com.aprendizes.info.domain.provedor.*;
import br.com.aprendizes.info.domain.response.*;
import br.com.aprendizes.info.util.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoService {

    public InfoProvedor obterInfo() {
        return InfoRepositoryMock.mockInfoProvedorResponse();
    }

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

    public DadoPessoalResponse obterDadosPessoais(Integer idPessoa) {
        List<DadoPessoal> dadosListProvedor = DadosPessoalRepositoryMock.mockDadoPessoalResponse();
        List<DadoPessoal> dadosListResponse = new ArrayList<>();
        for (DadoPessoal dadoPessoal : dadosListProvedor) {
            if (idPessoa == dadoPessoal.getIdPessoa()) {
                dadosListResponse.add(dadoPessoal);
            }
        }
        return new DadoPessoalResponse(dadosListResponse);
    }

    public ViagensResponse obterViagens(Integer idPessoa) {
        List<Viagens> viagensListProvedor = ViagensRepositoryMock.mockViagensResponse();
        List<Viagens> viagensListResponse = new ArrayList<>();
        for (Viagens viagens: viagensListProvedor){
            if (idPessoa == viagens.getIdPessoa()){
                viagensListResponse.add(viagens);
            }
        }
        return new ViagensResponse(viagensListResponse);
    }

    public SeriesResponse obterSeries(Integer idPessoa) {
        List<Series> seriesListProvedor = SeriesRepositoryMock.mockSeriesProvedorResonce();
        List<Series> seriesListResponse = new ArrayList<>();
        for (Series series : seriesListProvedor) {
            if (idPessoa == series.getIdPessoa()) {
                seriesListResponse.add(series);
            }
        }
        return new SeriesResponse(seriesListResponse);
    }
}



