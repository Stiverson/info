package br.com.aprendizes.info.domain.response;

import br.com.aprendizes.info.domain.provedor.Curso;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class CursosResponse {
    private List<Curso> data;
}
