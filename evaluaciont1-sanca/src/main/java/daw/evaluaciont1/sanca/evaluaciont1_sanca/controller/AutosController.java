package daw.evaluaciont1.sanca.evaluaciont1_sanca.controller;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Autos;
import daw.evaluaciont1.sanca.evaluaciont1_sanca.service.AutosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AutosController {

    private final AutosService autosService;

    @GetMapping("/api/v1/cars/{id}")
    public Autos obtenerAutoXid(
            @PathVariable("id") Long id){
        return autosService.obtenerAutoXid(id);
    }
}
