package com.PeluqueriaWeb.Master.Controller;

import com.PeluqueriaWeb.Master.Model.Clientes;
import com.PeluqueriaWeb.Master.Repository.ToDoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoRespository todoRepository;

/**/

    @GetMapping(value = "/tareas")
    public List <Clientes> getTareas(){
        return todoRepository.findAll();
    }
    @PostMapping(value = "/guardartarea")
    public String guardarTarea(@RequestBody Clientes clientes){
        todoRepository.save(clientes);
        return "Tarea guardada";
    }
    @PutMapping(value = "/actualizar/{id}")
    public String ActualizarCliente(@PathVariable long id, @RequestBody Clientes clientes){
        Clientes actualizarCliente = todoRepository.findById(id).get();
        actualizarCliente.setNombre((clientes.getNombre()));
        actualizarCliente.setApellido((clientes.getApellido()));
        todoRepository.save((actualizarCliente));
        return "Cliente actualizado";
    }
}