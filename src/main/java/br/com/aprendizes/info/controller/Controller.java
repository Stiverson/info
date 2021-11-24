package br.com.aprendizes.info.controller;


import br.com.aprendizes.info.domain.provedor.DadoPessoal;
import br.com.aprendizes.info.domain.provedor.InfoProvedor;
import br.com.aprendizes.info.domain.response.*;
import br.com.aprendizes.info.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1")

public class Controller {

    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public ResponseEntity<InfoProvedor> obterInfo() {
        return ResponseEntity.ok(infoService.obterInfo());
    }

    @GetMapping("/filmes/{id_pessoa}")
    public ResponseEntity<FilmesResponse> obterFilmes(@PathVariable(name = "id_pessoa") Integer idPessoa) {
        return ResponseEntity.ok(infoService.obterFilmes(idPessoa));
    }

    @GetMapping("/cursos/{id_pessoa}")
    public ResponseEntity<CursosResponse> obterCursos(@PathVariable(name = "id_pessoa") Integer idPessoa) {
        return ResponseEntity.ok(infoService.obterCurso(idPessoa));
    }

    @GetMapping("/dadospessoais/{id_pessoa}")
    public ResponseEntity<DadoPessoalResponse> obterDadosPessoais(@PathVariable(name = "id_pessoa") Integer idPessoa) {
        return ResponseEntity.ok(infoService.obterDadosPessoais(idPessoa));
    }

    @GetMapping("/viagens/{id_pessoa}")
    public ResponseEntity<ViagensResponse> obterViagens(@PathVariable(name = "id_pessoa") Integer idPessoa) {
        return ResponseEntity.ok(infoService.obterViagens(idPessoa));
    }

    @GetMapping("/series/{id_pessoa}")
    public ResponseEntity<SeriesResponse> obterSeries(@PathVariable(name = "id_pessoa") Integer idPessoa) {
        return ResponseEntity.ok(infoService.obterSeries(idPessoa));
    }
}