package io.github.HenriqueWegner.ClientsApp;

import io.github.HenriqueWegner.ClientsApp.model.entity.Client;
import io.github.HenriqueWegner.ClientsApp.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientsApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ClientsApplication.class, args);
    }
}
