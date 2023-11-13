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
public class InventarioController {

    //@Autowired
    //private ProductoService service;

    // private final Logger logger = LogManager.getLogger(InventarioController.class);
    
     @GetMapping("/inventarioKiwi")
    public String showInventario(){
        return "Tarea03/inventarioKiwi/inventarioKiwi";
    }  
    
    @GetMapping("/formularioInventarioKiwi")
    public String showFormulario(){
        return "Tarea03/inventarioKiwi/formularioInventario";
    }   

    /*  
     @GetMapping("/create")
     public String create(Model model) {
        model.addAttribute("tipos", TipoProducto.values());

         return "Tarea03/inventarioKiwi/formularioInventario";
    } 
    */

    /*  
    @PostMapping("/save")
    public String save(@ModelAttribute Producto producto) {
        System.out.println("*********** ATRIBUTOS RECIBIDOS: ");
        System.out.println(producto.getNombre());
        System.out.println(producto.getDescripcion());
        System.out.println(producto.getCantidad());
        System.out.println(producto.getProveedor());
        System.out.println(producto.getPeriodo().getFechaAdquisicion());
        System.out.println(producto.getPeriodo().getFechaCaduca());
        System.out.println(producto.getTipo().etiqueta);
        service.saveProducto(producto);

        return "redirect:/Tarea03/inventarioKiwi/inventarioKiwi";
    }
    */
}
