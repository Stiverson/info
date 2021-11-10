package br.com.aprendizes.info.domain.provedor;

import lombok.Data;

@Data
public class Filmes {

    private Integer idPessoa;
    private String titulo;
    private String diretor;
    private String elenco;
    private String data_lancamento;
    private String duracao;
    private String streaming;


}
