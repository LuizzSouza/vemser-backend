package br.com.dbc.vemser.pessoaapi.dto;

import br.com.dbc.vemser.pessoaapi.enums.TipoContato;
import lombok.Data;

@Data
public class ContatoCreateDTO {
    private Integer idPessoa;
    private TipoContato tipoContato;
    private String numero;
    private String descricao;
}
