package br.com.jonatas.forum.repository;

import br.com.jonatas.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository <Topico, Long> {

    List<Topico> findByCurso_Nome(String nomeCurso);
}
