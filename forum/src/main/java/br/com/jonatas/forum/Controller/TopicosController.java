package br.com.jonatas.forum.Controller;

import br.com.jonatas.forum.Controller.Dto.TopicoDTO;
import br.com.jonatas.forum.Controller.Form.TopicoForm;
import br.com.jonatas.forum.Model.Topico;
import br.com.jonatas.forum.Repository.CursoRepository;
import br.com.jonatas.forum.Repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<TopicoDTO> lista(String nomeCurso){
        if (nomeCurso == null){
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDTO.converter(topicos);
        }else{
            List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
            return TopicoDTO.converter(topicos);
        }
    }

    @PostMapping
    public void cadastrar(@RequestBody TopicoForm topicoForm){
        Topico topico = topicoForm.converter(cursoRepository);

        topicoRepository.save(topico);
    }
}