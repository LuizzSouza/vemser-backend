package br.com.dbc.vemser.pessoaapi.controller;

import br.com.dbc.vemser.pessoaapi.entity.Endereco;
import br.com.dbc.vemser.pessoaapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;


   @GetMapping // localhost:8080/endereco
   public List<Endereco> list() {
       return enderecoService.list();
   }

   @PostMapping("/{idPessoa}")
   public Endereco create(@RequestBody Endereco endereco, @PathVariable("idPessoa") Integer idPessoa) {
       return enderecoService.create(endereco, idPessoa);
   }

   @PutMapping("/{idEndereco}")
   public Endereco update(@PathVariable("idEndereco") Integer idEndereco, @RequestBody Endereco enderecoAtualizar) throws Exception {
       return enderecoService.update(idEndereco, enderecoAtualizar);
   }

   @DeleteMapping("/{idEndereco}")
    public void delete(@PathVariable("idEndereco") Integer idEndereco) throws Exception {
       enderecoService.delete(idEndereco);
   }

   @GetMapping("/{idEndereco}")
   public List<Endereco> listByIdEndereco(@PathVariable("idEndereco") Integer idEndereco) {
       return enderecoService.listByIdEndereco(idEndereco);
   }

   @GetMapping("/{idPessoa}/pessoa")
   public List<Endereco> listByIdPessoa(@PathVariable("idPessoa") Integer idPessoa) {
       return enderecoService.listByIdPessoa(idPessoa);
   }


}
