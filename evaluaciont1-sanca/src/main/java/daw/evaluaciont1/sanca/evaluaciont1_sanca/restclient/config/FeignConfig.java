package daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.config;

import daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.errorhandler.CustomErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
