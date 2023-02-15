
package com.TiendaM_IQ2023.controller;

import com.TiendaM_IQ2023.domain.Cliente;
import com.TiendaM_IQ2023.dao.ClienteDao;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model){
      //log.info("Ahora desde MVC");
        //model.addAttribute("Mensaje", "Hola desde el controlador");
        //Cliente cliente = new Cliente("Josseline", "Jiménez Carmona", "josselinejimenez8@gmail.com", "85889822");
        //Cliente cliente2 = new Cliente("Juan", "Mora Quesada", "jumora@gmail.com", "89652836");
        //Cliente cliente3 = new Cliente("Mauricio", "Sánchez Aragón", "wilim11@hotmail.com", "87533773");
        
        //model.addAttribute("objetoCliente", cliente);      
        //List<Cliente> clientes = Arrays.asList(cliente, cliente2, cliente3);
        
        var clientes = clienteDao.findAll();
        model.addAttribute("Clientes", clientes);
        return "index";
    }
    
}
