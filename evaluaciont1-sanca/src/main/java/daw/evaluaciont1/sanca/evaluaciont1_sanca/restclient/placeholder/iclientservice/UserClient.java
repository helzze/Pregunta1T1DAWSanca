package daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.iclientservice;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Autos;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "userClient", url = "https://freetestapi.com")
public interface UserClient {

    @GetMapping("/api/v1/cars/{id}")
    Autos obtenerAutoXid(
            @PathVariable("id") Long id);
}
