package com.example.testworkmdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestWorkMddApplication
{

    public static void main(String[] args)
    {

        ConfigurableApplicationContext cont= SpringApplication.run(TestWorkMddApplication.class, args);
        Alien a = cont.getBean(Alien.class);
        //System.out.println(a.multiplica(80, 7));
        a.show();

        Laptop l = cont.getBean(Laptop.class);
        l.compile();



    }
}
