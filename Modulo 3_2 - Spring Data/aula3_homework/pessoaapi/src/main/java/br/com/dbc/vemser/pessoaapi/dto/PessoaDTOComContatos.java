package br.com.dbc.vemser.pessoaapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class PessoaDTOComContatos extends PessoaCreateDTO {
    private Integer idPessoa;
    private List<ContatoDTO> contatos;
}
