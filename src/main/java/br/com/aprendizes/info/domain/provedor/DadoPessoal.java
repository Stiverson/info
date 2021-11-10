package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DadoPessoal {
    private Integer idPessoa;
    private String nome;
    private Integer idade;
    private String nacionalidade;
    private String estadoCivil;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private String nomeEscola;
    private String escolaridade;

}
