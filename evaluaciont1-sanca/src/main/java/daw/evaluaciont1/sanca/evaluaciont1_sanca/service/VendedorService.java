package daw.evaluaciont1.sanca.evaluaciont1_sanca.service;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.iclientservice.VendedorClient;
import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model.Vendedor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VendedorService {
    private final VendedorClient vendedorClient;

    public Vendedor obtenerVendedorXid(String id){
        return vendedorClient.obtenerVendedorXid(id);
    }

}
