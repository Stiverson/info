package br.com.aprendizes.info.domain.response;

import br.com.aprendizes.info.domain.provedor.DadoPessoal;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class DadoPessoalResponse {
    private List<DadoPessoal> data;
}
