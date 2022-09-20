package com.example.parcial.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;


@Entity
@Data
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 630649573930779175L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable=false,updatable=false)
    private Long id;
    @NotBlank(message = "Email cannot be empty or null")
    private String email;
    @NotBlank(message = "Phone cannot be empty or null")
    private Integer phone;
    @NotBlank(message = "Name cannot be empty or null")
    private String name;

}
