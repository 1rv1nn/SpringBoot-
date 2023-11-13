/* package tdi.recetas.service;

import tdi.recetas.model.Producto;
import tdi.recetas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    public List<Producto> getProductos() {
        return repository.findAll();
    }

    public Producto saveProducto(Producto producto) {
        return repository.save(producto);
    }

}
*/
