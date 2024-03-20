package br.com.project.apidistribuidora.controller;

import br.com.project.apidistribuidora.dto.ClientDataDto;
import br.com.project.apidistribuidora.dto.ClientDto;
import br.com.project.apidistribuidora.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("cliente")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping
    public ResponseEntity cadastrarCliente(@RequestBody ClientDto dadosClient) {
        var novoCliente = clientService.cadastrar(dadosClient);
        return ResponseEntity.ok().body(novoCliente);
    }
    @GetMapping
    public ResponseEntity<List<ClientDataDto>> listarCliente() {
        var clientes = clientService.listar();
        return ResponseEntity.ok().body(clientes);

    }
    @PutMapping("/{id}")
    public ResponseEntity atualizarCliente(@PathVariable Long id, @RequestBody ClientDto dadosClient) {
        var clienteAtualizado = clientService.atualizar(id, dadosClient);
        return ResponseEntity.ok().body(clienteAtualizado);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity excluirCliente(@PathVariable Long id) {
        clientService.remover(id);
        return ResponseEntity.ok().build();
    }

}
