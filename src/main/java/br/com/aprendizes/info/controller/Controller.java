package br.com.aprendizes.info.controller;


import br.com.aprendizes.info.domain.provedor.InfoProvedor;
import br.com.aprendizes.info.domain.response.CursosResponse;
import br.com.aprendizes.info.domain.response.FilmesResponse;
import br.com.aprendizes.info.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class Controller {

    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public ResponseEntity<InfoProvedor> obterInfo(){
        return ResponseEntity.ok(infoService.obterInfo());
    }

    @GetMapping("/filmes/{id_pessoa}")
    public ResponseEntity<FilmesResponse> obterFilmes(@PathVariable(name = "id_pessoa") Integer idPessoa){
        return ResponseEntity.ok(infoService.obterFilmes(idPessoa));
    }

    @GetMapping("/cursos/{id_pessoa}")
    public ResponseEntity<CursosResponse> obterCursos(@PathVariable(name = "id_pessoa") Integer idPessoa) {
       return ResponseEntity.ok(infoService.obterCurso(idPessoa));
   }
/*
    @GetMapping("/dadospessoal/{id}")
    public ResponseEntity<DadoPessoal> obterInformacoes(@PathVariable(name = "id") Integer id ) {
        return ResponseEntity.ok(infoService.obterInformacoes(id));
    }*/
}
