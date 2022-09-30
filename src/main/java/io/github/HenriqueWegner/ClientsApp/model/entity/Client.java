package io.github.HenriqueWegner.ClientsApp.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
    @NotEmpty(message = "{field.name.obligatory}")
    private String name;

    @Column(nullable = false, length = 11)
    @NotNull(message = "{field.cpf.obligatory}" )
    @CPF(message = "{field.cpf.invalid}")
    private String cpf;

    @Column(name = "registration_date", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate registrationDate;

    @PrePersist
    public void prePersist(){
        setRegistrationDate(LocalDate.now());
    }

}
