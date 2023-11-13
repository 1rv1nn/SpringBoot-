package tdi.recetas.controllers;

//import tdi.recetas.model.Producto;
//import tdi.recetas.model.TipoProducto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
//import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import tdi.recetas.service.ProductoService;

@Controller
public class InstruccionController {
    @GetMapping("/instrucciones")
    public String showIntrucciones(){
        return "Tarea03/recetasKiwi/ensaladaPastaFria";
    }  

    @GetMapping("/instruccion")
    public String showIntrucciones2(){
        return "Tarea03/recetasKiwi/ensaladaMixtaTradicional";
    }  
    
}
