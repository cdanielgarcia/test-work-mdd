package com.example.testworkmdd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Garcia on 14/07/23
 */
@Component("daniel")
public class Person
{
    private int id;
    private String name;

    public Person(){
        System.out.println("A person");
    }

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
    public int calculo(int a, int b){
        return a*b;
    }
}
