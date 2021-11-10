package br.com.aprendizes.info.service;

import br.com.aprendizes.info.domain.provedor.Filmes;
import br.com.aprendizes.info.domain.response.FilmesResponse;
import br.com.aprendizes.info.util.FilmesRepositoryMock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    public FilmesResponse obterFilmes(Integer idPessoa) {
        List<Filmes> filmesList = FilmesRepositoryMock.mockFilmesProvedorResponse();

        for (Filmes filme : filmesList) {
            if(idPessoa == filme.getIdPessoa()){
                return new FilmesResponse(filme);
            }
        }
    }

}



