/*
Benefits of Inheritance

*Avoid duplicating code in two different places
*Additions or modifications to the superclass will automatically affect all subclasses
*Promotes code re-usability and scalability
*Common properties and functionality can be written in one class
*Other classes inherit from the common class and add on unique functionality

Leveraging Inheritance in Java

*In Java, a class can only have one super class, but multiple subclasses
*If you need multiple super classes, use multilevel inheritance
*In Java, we can achieve inheritance by using the keyword extends



 */
public class Inheritance {
    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(40));



    }
}
