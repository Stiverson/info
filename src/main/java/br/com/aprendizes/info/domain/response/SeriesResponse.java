package br.com.aprendizes.info.domain.response;

import br.com.aprendizes.info.domain.provedor.Series;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data

public class SeriesResponse {
    private List<Series> data;
}
