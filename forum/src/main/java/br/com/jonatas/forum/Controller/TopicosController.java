package br.com.jonatas.forum.Controller;

import br.com.jonatas.forum.Model.Curso;
import br.com.jonatas.forum.Model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<Topico> lista(){
        Topico topico = new Topico("Duvida", "Duvida com spring", new Curso("Spring",
                "Programacao"));

        return Arrays.asList(topico);
    }
}