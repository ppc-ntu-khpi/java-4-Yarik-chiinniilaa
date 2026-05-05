package domain;

public class Animal {
    protected String name;
    protected int weight;

    public Animal() {
        name = "generic animal";
        weight = 25;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return String.format("My animal:\nName:\t%s\nWeight:\t%d kg", name, weight);
    }
}