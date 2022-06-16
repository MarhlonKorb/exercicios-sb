package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return  new Cliente(27, "Marhlon", "123.456.789-10");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "Marthin", "010.203.040-50");
    }
}
