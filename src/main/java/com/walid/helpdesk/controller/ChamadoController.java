package com.walid.helpdesk.controller;

import com.walid.helpdesk.model.Chamado;
import com.walid.helpdesk.service.ChamadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    private final ChamadoService service;

    public ChamadoController(ChamadoService service) {
        this.service = service;
    }

    // GET → listar todos os chamados
    @GetMapping
    public List<Chamado> listar() {
        return service.listar();
    }

    // POST → criar um novo chamado
    @PostMapping
    public Chamado criar(@RequestBody Chamado chamado) {
        return service.criar(chamado);
    }

    // PUT → atualizar um chamado existente
    @PutMapping("/{id}")
    public Chamado atualizar(@PathVariable Long id, @RequestBody Chamado chamado) {
        return service.atualizar(id, chamado);
    }

    // DELETE → deletar um chamado
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
