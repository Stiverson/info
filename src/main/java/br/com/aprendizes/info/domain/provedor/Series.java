package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Series {
    private Integer idPessoa;
    private String titulo;
    private String protagonistas;
    private String diretor;
    private String primeiroEpisodio;
    private String ultimoEpisodio;
    private String elenco;
    private String streaming;

}
