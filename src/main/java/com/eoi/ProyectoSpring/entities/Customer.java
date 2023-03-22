package com.eoi.ProyectoSpring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor  // Constructor sin argumentos
@AllArgsConstructor  // Constructor con todos los argumentos
@Entity  // Declaración de entidad. Para guardarla en la base de datos
@Table(name = "customer")  // Nombre de la tabla
public class Customer {

    @Id  // Genera una clave primaria en la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String name;

    private String secondName;

    private String thirdName;

    private String email;

    private LocalDate birthDate;

    private LocalDateTime registrationDateTime;

    public Customer(String name, String secondName, String thirdName, String email, LocalDate birthDate, LocalDateTime registrationDateTime) {
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.email = email;
        this.birthDate = birthDate;
        this.registrationDateTime = registrationDateTime;
    }
}
