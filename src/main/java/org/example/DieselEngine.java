package org.example;

import org.springframework.stereotype.Component;

@Component("dieselEngine")

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("diesel engine started");
    }
}
