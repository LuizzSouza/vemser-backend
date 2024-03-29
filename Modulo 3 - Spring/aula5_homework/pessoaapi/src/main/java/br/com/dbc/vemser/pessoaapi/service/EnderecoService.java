package br.com.dbc.vemser.pessoaapi.service;

import br.com.dbc.vemser.pessoaapi.dto.EnderecoCreateDTO;
import br.com.dbc.vemser.pessoaapi.dto.EnderecoDTO;
import br.com.dbc.vemser.pessoaapi.entity.Endereco;
import br.com.dbc.vemser.pessoaapi.exceptions.RegraDeNegocioException;
import br.com.dbc.vemser.pessoaapi.repository.EnderecoRepository;
import br.com.dbc.vemser.pessoaapi.repository.PessoaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ObjectMapper objectMapper;


    public EnderecoDTO create(EnderecoCreateDTO enderecoCreate, Integer idPessoa) throws Exception {
        log.info("chamando o método create");
        pessoaRepository.list().stream()
                .filter(pessoa -> pessoa.getIdPessoa().equals(enderecoCreate.getIdPessoa()))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada"));

        Endereco endereco = objectMapper.convertValue(enderecoCreate, Endereco.class);

        return objectMapper.convertValue(enderecoRepository.create(endereco, idPessoa), EnderecoDTO.class);


    }

    public List<EnderecoDTO> list() {
        log.info("chamando o método list");
        return enderecoRepository.list()
                .stream()
                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                .collect(Collectors.toList());
    }

    public EnderecoDTO update(Integer id, EnderecoCreateDTO enderecoAtualizar) throws Exception {
        log.info("chamando o método update");
        pessoaRepository.list().stream()
                .filter(pessoa -> pessoa.getIdPessoa().equals(enderecoAtualizar.getIdPessoa()))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada"));

        Endereco endereco = objectMapper.convertValue(enderecoAtualizar, Endereco.class);

        return objectMapper.convertValue(enderecoRepository.update(id, endereco), EnderecoDTO.class);
    }

    public void delete(Integer id) throws Exception {
        log.warn("chamando o método delete");
        enderecoRepository.delete(id);
    }

    public List<EnderecoDTO> listByIdEndereco(Integer idEndereco) {
        log.info("chamando o método listByIdEndereco");
        return enderecoRepository.listByIdEndereco(idEndereco)
                .stream()
                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                .collect(Collectors.toList());
    }

    public List<EnderecoDTO> listByIdPessoa(Integer idPessoa) {
        log.info("chamando o método listByIdPessoa");
        return enderecoRepository.listByIdPessoa(idPessoa)
                .stream()
                .map(endereco -> objectMapper.convertValue(endereco, EnderecoDTO.class))
                .collect(Collectors.toList());
    }

}
