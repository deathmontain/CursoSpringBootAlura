package br.com.jonatas.forum.Controller;

import br.com.jonatas.forum.Controller.Dto.TopicoDTO;
import br.com.jonatas.forum.Model.Curso;
import br.com.jonatas.forum.Model.Topico;
import br.com.jonatas.forum.Repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(){
        List<Topico> topicos = topicoRepository.findAll();

        return TopicoDTO.converter(topicos);
    }
}