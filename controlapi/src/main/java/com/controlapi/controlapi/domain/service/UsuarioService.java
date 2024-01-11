package com.controlapi.controlapi.domain.service;

import com.controlapi.controlapi.domain.model.Usuario;
import com.controlapi.controlapi.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }



}
