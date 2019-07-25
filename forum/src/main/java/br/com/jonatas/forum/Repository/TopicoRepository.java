package br.com.jonatas.forum.Repository;

import br.com.jonatas.forum.Model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository <Topico, Long> {

}
