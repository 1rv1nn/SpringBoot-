/* 
package tdi.recetas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.validation.GroupSequence;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 


@Data
@AllArgsConstructor
@NoArgsConstructor
@GroupSequence({DateRange.class, Producto.class})
@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String descripcion;

    @NotNull
    private int cantidad;


    @NotNull
    private String Proveedor;

    
    @Valid
    private DateRange periodo;


    @NotNull(message = "El tipo de producto es obligatorio")
    private TipoProducto tipo;


}
  */
