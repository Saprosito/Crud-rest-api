package com.example.parcial.models;

import java.io.Serial;
import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -3091325720016902942L;
    private Long id;
    private String email;
    private Integer phone;
    private String name;

}
