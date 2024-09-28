package daw.evaluaciont1.sanca.evaluaciont1_sanca.restclient.placeholder.model;

import lombok.Data;

@Data
public class Autos {
    private Long id;
    private String make;
    private String model;
    public int year;
    private String color;
    private double price;
}
