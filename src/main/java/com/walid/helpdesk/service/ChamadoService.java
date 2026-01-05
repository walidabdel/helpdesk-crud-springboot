package com.walid.helpdesk.service;

import com.walid.helpdesk.model.Chamado;
import com.walid.helpdesk.repository.ChamadoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChamadoService {

    private final ChamadoRepository repository;

    public ChamadoService(ChamadoRepository repository) {
        this.repository = repository;
    }

    // GET → listar todos os chamados
    public List<Chamado> listar() {
        return repository.findAll();
    }

    // POST → criar um novo chamado
    public Chamado criar(Chamado chamado) {
        return repository.save(chamado);
    }

    // PUT → atualizar um chamado existente
    public Chamado atualizar(Long id, Chamado chamado) {
        Chamado existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado: " + id));

        existente.setTitulo(chamado.getTitulo());
        existente.setDescricao(chamado.getDescricao());
        existente.setStatus(chamado.getStatus());

        return repository.save(existente);
    }

    // DELETE → deletar um chamado
    public void deletar(Long id) {
        Chamado existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Chamado não encontrado: " + id));
        repository.delete(existente);
    }
}
