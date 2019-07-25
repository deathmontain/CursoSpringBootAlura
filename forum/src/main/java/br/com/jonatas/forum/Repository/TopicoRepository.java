package br.com.jonatas.forum.Repository;

import br.com.jonatas.forum.Model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository <Topico, Long> {

    List<Topico> findByCurso_Nome(String nomeCurso);
}
