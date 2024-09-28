package daw.evaluaciont1.sanca.evaluaciont1_sanca.controller;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Sede;
import daw.evaluaciont1.sanca.evaluaciont1_sanca.service.SedeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SedeController {

    private final SedeService sedeService;
    @GetMapping("/sedes/{id}")
    public Sede obtenerSedeXid(
            @PathVariable("id") String id){
        return sedeService.obtenerSedeXid(id);
    }
}
