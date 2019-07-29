package br.com.jonatas.forum.Controller.Form;

import br.com.jonatas.forum.Model.Curso;
import br.com.jonatas.forum.Model.Topico;
import br.com.jonatas.forum.Repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TopicoForm {
    private String titulo;
    private String mensagem;
    private String nomeCurso;

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);

        return new Topico(titulo, mensagem, curso);
    }
}