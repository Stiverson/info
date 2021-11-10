package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curso {

    private Integer idPessoa;
    private String nomeDoAluno;
    private String titulo;
    private String instituicao;
}
