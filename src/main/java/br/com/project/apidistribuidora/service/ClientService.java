package br.com.project.apidistribuidora.service;

import br.com.project.apidistribuidora.dto.ClientDataDto;
import br.com.project.apidistribuidora.dto.ClientDto;
import br.com.project.apidistribuidora.model.Client;
import br.com.project.apidistribuidora.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Transactional
    public ClientDataDto cadastrar(ClientDto clientDto) {
        Client client = new Client(clientDto);
        clientRepository.save(client);
        return new ClientDataDto(client);
    }
    public List<ClientDataDto> listar() {
        return clientRepository
                .findAll()
                .stream()
                .map(ClientDataDto::new)
                .toList();

    }
    @Transactional
    public ClientDataDto atualizar(Long id, ClientDto clientUpdateDto) {
        Client cliente = clientRepository.getReferenceById(id);
        cliente.atualizarCadastro(clientUpdateDto);
        return new ClientDataDto(cliente);

    }
    @Transactional
    public void remover(Long id) {
        Client cliente = clientRepository.getReferenceById(id);
        clientRepository.delete(cliente);
    }

}
