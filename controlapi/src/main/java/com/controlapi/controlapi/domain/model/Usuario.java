package com.controlapi.controlapi.domain.model;

import com.controlapi.controlapi.domain.model.tipos.GrupoUsuario;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String email;

    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "datetime")
    private OffsetDateTime dataCadastro;

    @Column(nullable = false)
    private GrupoUsuario grupo;




}
