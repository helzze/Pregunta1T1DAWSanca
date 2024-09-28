package daw.evaluaciont1.sanca.evaluaciont1_sanca.service;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.iclientservice.SedeClient;
import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Sede;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SedeService {
    private final SedeClient sedeClient;

    public Sede obtenerSedeXid(String id){
        return sedeClient.obtenerSedeXid(id);
    }
}
