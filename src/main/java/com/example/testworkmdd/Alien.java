package com.example.testworkmdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Garcia on 13/07/23
 */
@Component
//@Scope(value = "prototype") It avoid the creation defect instance
public class Alien
{
    private int id;
    private String aname;
    private String techs;
    @Autowired
    private Laptop laptop;

    public Alien()
    {
        System.out.println("A alien");
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAname()
    {
        return aname;
    }

    public void setAname(String aname)
    {
        this.aname = aname;
    }

    public String getTech()
    {
        return techs;
    }

    public void setTech(String tech)
    {
        this.techs = tech;
    }

    public Laptop getLaptop()
    {
        return laptop;
    }

    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
    }

    public int multiplica(int a, int b){
        return a * b;
    }

    public void show(){
        System.out.println("Show from Alien");
        laptop.compile();
    }
}
