package domain;

public class Main {
    public static void main(String[] args) {
        Tardigrade myTardigrade = new Tardigrade("Квант", 1);

        System.out.println(myTardigrade.toString());
        myTardigrade.speak();
        myTardigrade.eat();
        
        System.out.println("\n--- Зміна стану ---");
        myTardigrade.enterCryptobiosis();
        myTardigrade.eat();
    }
}