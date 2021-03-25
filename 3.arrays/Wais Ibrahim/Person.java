package com.company;
import java.util.ArrayList;


public class Person {
    private final String name;
    private final ArrayList<String> items;

    public Person(String name)
    {
        this.name = name;
        items = new ArrayList<String>(); // Create an ArrayList object
    }

    public void addItem(String itemName)
    {
        items.add(itemName);
    }

    public void removeItem(String itemName) 
    {
        items.remove(itemName);
    }

    public String getName()
    {
        return name;
    }

    public String getItems()
    {
        return items.toString();
    }
}
