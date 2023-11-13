/* 
package tdi.recetas.config.converter;

import tdi.recetas.model.TipoProducto;
import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;

public class TipoProductoConverter implements Converter<String, TipoProducto> {
    @Override
    public TipoProducto convert(String source) {
        return Arrays.stream(TipoProducto.values())
                .filter(s -> s.clave.equals(source))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
*/