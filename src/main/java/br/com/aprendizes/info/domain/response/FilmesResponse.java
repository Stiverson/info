package br.com.aprendizes.info.domain.response;

import br.com.aprendizes.info.domain.provedor.Filme;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class FilmesResponse {
    private List<Filme> data;
}
