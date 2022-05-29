package unoeste.fipp.silvio.webpiadas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unoeste.fipp.silvio.webpiadas.models.Categoria;
import unoeste.fipp.silvio.webpiadas.repositories.CategoriaRepository;

@RestController
@RequestMapping("/apis")
public class CategoriaRestController {

    @Autowired
    CategoriaRepository categoriaRepository;

    @GetMapping("/listar-todos")
    public ResponseEntity <Object> buscarTodos()
    {
        List <Categoria> cats = categoriaRepository.findAll();

        return new ResponseEntity<>(cats,HttpStatus.CREATED);
    }
    @PostMapping("/testar-acesso")
    public ResponseEntity <Object> testarAcesso()
    {
        return new ResponseEntity<>("Piada",HttpStatus.CREATED);
    }
}
