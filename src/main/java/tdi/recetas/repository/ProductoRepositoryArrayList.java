/* 
package tdi.recetas.repository;
import  tdi.recetas.model.Producto;
import tdi.recetas.model.TipoProducto;
import  tdi.recetas.model.DateRange;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepositoryArrayList {

    private final List<Producto> list = new ArrayList<>();

    private final Logger logger = LogManager.getLogger(ProductoRepositoryArrayList.class);

    public ProductoRepositoryArrayList() {
        logger.info("*********** CONSTRUCTUR: SemestreRepository");
        initDefaultProductos();
    }

    public void initDefaultProductos() {
        logger.info("*********** INIT DEFAULT");
        this.list.add(
                new Producto(
                        Long.parseLong("1"),
                        "Pasta",
                        "Pasta blanda",
                        2,
                        "pastas lola",
                        new DateRange(
                        LocalDate.of(2022, 8, 1),
                        LocalDate.of(2022, 12, 1)
                        ),
                        TipoProducto.PERECEDERO
                )
        );
       
    }

    public List<Producto> getAllSemestres() {
        return this.list;
    }

  
   
    public Producto save(Producto p) {
        Producto producto = new Producto();
        producto.setNombre(p.getNombre());
        producto.setDescripcion(p.getDescripcion());
        producto.setCantidad(p.getCantidad());
        producto.setProveedor(p.getProveedor());
        producto.setPeriodo(p.getPeriodo());
        producto.setTipo(p.getTipo());
        logger.debug("*********** LIST: " + list);
        this.list.add(producto);

        return producto;
        
        }
    
}
*/