package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}
