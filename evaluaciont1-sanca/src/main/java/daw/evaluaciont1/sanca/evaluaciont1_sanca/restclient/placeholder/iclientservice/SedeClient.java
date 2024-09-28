package daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.iclientservice;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Sede;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sedeClient", url = "localhost:8080")
public interface SedeClient {

    @GetMapping("/sedes/{id}")
    Sede obtenerSedeXid(
            @PathVariable("id") String id);
}