package br.com.dbc.vemser.pessoaapi.repository;

import br.com.dbc.vemser.pessoaapi.entity.Pessoa;
import br.com.dbc.vemser.pessoaapi.exceptions.RegraDeNegocioException;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;

@Repository
@Log
public class PessoaRepository {
  private static List<Pessoa> listaPessoas = new ArrayList<>();
  private AtomicInteger COUNTER = new AtomicInteger();

  public PessoaRepository() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //18/10/2020
    listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*1*/, "Maicon Gerardi", LocalDate.parse("10/10/1990", formatter), "12345678910", "email1@sla.com.br"));
    listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*2*/, "Charles Pereira", LocalDate.parse("08/05/1985", formatter), "12345678911", "email2@sla.com.br"));
    listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*3*/, "Marina Oliveira", LocalDate.parse("30/03/1970", formatter), "12345678912", "email3@sla.com.br"));
    listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*4*/, "Rafael Lazzari", LocalDate.parse("01/07/1990", formatter), "12345678916", "email4@sla.com.br"));
    listaPessoas.add(new Pessoa(COUNTER.incrementAndGet() /*5*/, "Ana", LocalDate.parse("01/07/1990", formatter), "12345678917", "email5@sla.com.br"));
  }

  public Pessoa create(Pessoa pessoa) {
    pessoa.setIdPessoa(COUNTER.incrementAndGet());
    listaPessoas.add(pessoa);
    return pessoa;
  }

  public List<Pessoa> list() {
    return listaPessoas;
  }

  public Pessoa update(Integer id,
                       Pessoa pessoaAtualizar) throws Exception {
    Pessoa pessoaRecuperada = listaPessoas.stream()
            .filter(pessoa -> pessoa.getIdPessoa().equals(id))
            .findFirst()
            .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada"));
    pessoaRecuperada.setCpf(pessoaAtualizar.getCpf());
    pessoaRecuperada.setNome(pessoaAtualizar.getNome());
    pessoaRecuperada.setDataNascimento(pessoaAtualizar.getDataNascimento());
    pessoaRecuperada.setEmail(pessoaAtualizar.getEmail());
    return pessoaRecuperada;
  }

  public void delete(Integer id) throws Exception {
    Pessoa pessoaRecuperada = listaPessoas.stream()
            .filter(pessoa -> pessoa.getIdPessoa().equals(id))
            .findFirst()
            .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada"));
    listaPessoas.remove(pessoaRecuperada);
  }

  public List<Pessoa> listByName(String nome) {
    return listaPessoas.stream()
            .filter(pessoa -> pessoa.getNome().toUpperCase().contains(nome.toUpperCase()))
            .collect(Collectors.toList());
  }



}