package pe.restapi1.sanca.apirest1_sanca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.restapi1.sanca.apirest1_sanca.model.Vendedor;
import java.util.Arrays;
import java.util.List;

@RestController
public class VendedorController {

    @GetMapping("/vendedores")
    public List<Vendedor> getVendedores(){
        return Arrays.asList(
                new Vendedor("1", "Vendedor1", "987654321"),
                new Vendedor("2", "Vendedor2", "987654322")
        );
    }
    @GetMapping("/vendedores/1")
    public List<Vendedor> getVendedores1(){
        return Arrays.asList(
                new Vendedor("1", "Vendedor1", "987654321")
        );
    }
    @GetMapping("/vendedores/2")
    public List<Vendedor> getVendedores2(){
        return Arrays.asList(
                new Vendedor("2", "Vendedor2", "987654322")
        );
    }
}
