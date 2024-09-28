package daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.iclientservice;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Vendedor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@FeignClient(name = "vendedorClient", url = "localhost:8081")
public interface VendedorClient {

    @GetMapping("/vendedores/{id}")
    Vendedor obtenerVendedorXid(
            @PathVariable("id") String id);

}

