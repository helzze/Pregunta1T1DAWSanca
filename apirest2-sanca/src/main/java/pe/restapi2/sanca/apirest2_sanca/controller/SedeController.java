package pe.restapi2.sanca.apirest2_sanca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.restapi2.sanca.apirest2_sanca.model.Sede;

import java.util.Arrays;
import java.util.List;

@RestController
public class SedeController {
    @GetMapping("/sedes")
    public List<Sede> getSedes(){
        return Arrays.asList(
                new Sede("1","Plaza San Martin","912345678"),
                new Sede("2","Jockey Plaza","945362718")
        );
    }
    @GetMapping("/sedes/1")
    public List<Sede> getSedes1(){
        return Arrays.asList(
                new Sede("1", "Vendedor1", "987654321")
        );
    }
    @GetMapping("/sedes/2")
    public List<Sede> getSedes2(){
        return Arrays.asList(
                new Sede("2", "Vendedor2", "987654322")
        );
    }
}
