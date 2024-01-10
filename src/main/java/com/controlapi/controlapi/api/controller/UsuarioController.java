package com.controlapi.controlapi.api.controller;

import com.controlapi.controlapi.domain.model.Usuario;
import com.controlapi.controlapi.domain.repository.UsuarioRepository;
import com.controlapi.controlapi.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody Usuario usuario){
        usuarioService.salvar(usuario);

        return ResponseEntity.ok("Cadastrado com Sucesso");
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<Usuario> usuarioResponse = usuarios.stream()
                .map(usuario -> new Usuario(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getSenha(), usuario.getEmail(), usuario.getDataCadastro(), usuario.getGrupo()))
                .collect(Collectors.toList());
        return ResponseEntity.ok(usuarioResponse);
    }

}
