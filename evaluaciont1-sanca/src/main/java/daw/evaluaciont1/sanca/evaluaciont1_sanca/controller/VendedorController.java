package daw.evaluaciont1.sanca.evaluaciont1_sanca.controller;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Vendedor;
import daw.evaluaciont1.sanca.evaluaciont1_sanca.service.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class VendedorController {

    private final VendedorService vendedorService;
    @GetMapping("/vendedores/{id}")
    public Vendedor obtenerVendedorXid(
            @PathVariable("id") String id){
        return vendedorService.obtenerVendedorXid(id);
    }
}
