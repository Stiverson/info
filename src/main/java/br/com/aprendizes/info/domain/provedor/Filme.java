package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Filme {

    private Integer idPessoa;
    private String titulo;
    private String diretor;
    private String elenco;
    private String data_lancamento;
    private String duracao;
    private String streaming;


}
