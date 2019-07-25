package br.com.jonatas.forum.Repository;

import br.com.jonatas.forum.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);
}
