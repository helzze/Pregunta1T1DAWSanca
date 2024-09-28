package daw.evaluaciont1.sanca.evaluaciont1_sanca.service;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.iclientservice.UserClient;
import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Autos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//@AllArgsConstructor
@RequiredArgsConstructor
@Service
public class AutosService {
    private final UserClient userClient;

    public Autos obtenerAutoXid(Long id){
        return userClient.obtenerAutoXid(id);
    }
}
