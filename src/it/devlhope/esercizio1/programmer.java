package it.devlhope.esercizio1;

public class programmer
{
    public String name;
    public int age;
    public boolean wearsGlasses;

    public void drinkCoffe()
    {
        System.out.println("Espresso is the secret!");
    }
    public void printDetails()
    {
        System.out.println(name+" is a "+age+" yo programmer");
        this.name=name;
        this.age=age;
    }
    public void hasGlasses()
    {
        System.out.println("is "+name+" wearing glasses? "+wearsGlasses);
        this.name=name;
        this.wearsGlasses=wearsGlasses;
    }
}
