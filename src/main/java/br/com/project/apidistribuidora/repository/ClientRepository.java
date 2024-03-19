package br.com.project.apidistribuidora.repository;

import br.com.project.apidistribuidora.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
