package com.example.testworkmdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Garcia on 13/07/23
 */
@Component
public class Laptop
{
    private int id;
    private String name;
    @Autowired
    @Qualifier("daniel")
    private Person person;


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void compile(){

        System.out.println("compile from Laptop");
        System.out.println(person.calculo(4,5));
    }

    @Override
    public String toString()
    {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
