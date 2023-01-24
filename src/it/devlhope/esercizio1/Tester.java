package it.devlhope.esercizio1;

public class Tester
{
    public static void main(String args[])
    {
        programmer p1, p2;
        p1=new programmer();
        p2=new programmer();

        p1.age= 30;
        p1.wearsGlasses= false;
        p1.name="Marco";

        p2.age=20;
        p2.name="Gabriele";
        p2.wearsGlasses=false;

        p1.drinkCoffe();
        p1.printDetails();
        p2.printDetails();
        p2.hasGlasses();
    }
}
