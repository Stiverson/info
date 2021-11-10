package br.com.aprendizes.info.domain.provedor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Viagens {

    private Integer idPessoa;
    private String cidade;
    private String data;
    private String local;


}
