package io.github.HenriqueWegner.ClientsApp.model.repository;

import io.github.HenriqueWegner.ClientsApp.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
