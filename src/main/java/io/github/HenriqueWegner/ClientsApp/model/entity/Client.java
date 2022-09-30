package io.github.HenriqueWegner.ClientsApp.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "registration_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate registrationDate;

    @PrePersist
    public void prePersist(){
        setRegistrationDate(LocalDate.now());
    }

}
