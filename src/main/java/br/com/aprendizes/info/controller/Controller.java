package br.com.aprendizes.info.controller;


import br.com.aprendizes.info.domain.provedor.Curso;
import br.com.aprendizes.info.domain.provedor.DadoPessoal;
import br.com.aprendizes.info.domain.response.FilmesResponse;
import br.com.aprendizes.info.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private InfoService infoService;

    @GetMapping("/filmes")
    public ResponseEntity<FilmesResponse> obterFilmes() {
        return ResponseEntity.ok(infoService.getInfo());
    }

    @GetMapping("/cursos")
    public ResponseEntity<List<Curso>> obterCursos() {
        return ResponseEntity.ok(infoService.obterCursos());
    }
/*
    @GetMapping("/dadospessoal/{id}")
    public ResponseEntity<DadoPessoal> obterInformacoes(@PathVariable(name = "id") Integer id ) {
        return ResponseEntity.ok(infoService.obterInformacoes(id));
    }*/
}
