package io.github.HenriqueWegner.ClientsApp.model.repository;

import io.github.HenriqueWegner.ClientsApp.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
