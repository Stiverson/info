package br.com.aprendizes.info.domain.provedor;

import lombok.Data;

@Data
public class DadoPessoal {
    private Integer id;
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
