package tdi.recetas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class RecetaController {
 
     
    @GetMapping({"/","/default"})
    public String showDefault(){
        return "Tarea03/default";
    } 
     

     
    @GetMapping({"/recetas"})
    public String showRecetario(){
        return "Tarea03/recetario/recetas";
    } 

   

   
    
    
}
