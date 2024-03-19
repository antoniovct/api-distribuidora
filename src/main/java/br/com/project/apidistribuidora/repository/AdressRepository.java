package br.com.project.apidistribuidora.repository;

import br.com.project.apidistribuidora.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
