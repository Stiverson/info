package br.com.aprendizes.info.domain.response;

import br.com.aprendizes.info.domain.provedor.Viagens;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ViagensResponse {
    private List<Viagens> data;
}
